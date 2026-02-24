#!/usr/bin/env python3
"""
Script zum Generieren von SQL INSERT Statements aus CSV-Dateien
für BescheidTable und VordrucknummerTable

Keine externen Abhängigkeiten - nur Standard-Python-Bibliotheken!
"""

import sys
import os
import csv
from datetime import datetime


def escape_sql_string(value):
    """Escaped einfache Anführungszeichen für SQL"""
    if value is None or value == '' or (isinstance(value, float) and str(value) == 'nan'):
        return "NULL"
    return f"'{str(value).replace("'", "''")}'"


def read_csv_data(csv_path):
    """Liest CSV-Datei und gibt (headers, data_rows) zurück"""
    try:
        with open(csv_path, 'r', encoding='utf-8') as f:
            reader = csv.reader(f)
            rows = list(reader)
            
        if not rows:
            print("Fehler: CSV-Datei ist leer", file=sys.stderr)
            sys.exit(1)
            
        return rows[0], rows[1:]
    except Exception as e:
        print(f"Fehler beim Lesen der CSV-Datei: {e}", file=sys.stderr)
        sys.exit(1)


def generate_inserts(csv_path, output_path=None):
    """
    Liest CSV-Datei und generiert SQL INSERT statements
    
    Args:
        csv_path: Pfad zur CSV-Datei
        output_path: Optional - Pfad für Output-Datei (sonst stdout)
    """
    
    # CSV-Datei einlesen
    headers, data_rows = read_csv_data(csv_path)
    
    # Erwartete Spalten
    expected_cols = ['Vordruchnummer', 'Uberschrift', 'Kurzbezeichnung', 
                     'DialogProzess', 'Fachprozesse']
    
    # Finde Spalten-Indizes
    col_indices = {}
    for expected in expected_cols:
        try:
            col_indices[expected] = headers.index(expected)
        except ValueError:
            print(f"Fehler: Spalte '{expected}' nicht gefunden", file=sys.stderr)
            print(f"Vorhandene Spalten: {list(headers)}", file=sys.stderr)
            sys.exit(1)
    
    # SQL Statements generieren
    sql_statements = []
    sql_statements.append(f"-- SQL INSERT Statements generiert aus {os.path.basename(csv_path)}")
    sql_statements.append("-- Generiert am: " + datetime.now().strftime("%Y-%m-%d %H:%M:%S"))
    sql_statements.append("")
    
    # Für jede Datenzeile
    record_num = 0
    for row in data_rows:
        # Leere Zeilen überspringen
        if not row or all(cell is None or cell == '' for cell in row):
            continue
        
        record_num += 1
        bescheid_id_var = f"bescheid_id_{record_num}"
        
        # Werte extrahieren und escapen
        name = escape_sql_string(row[col_indices['Uberschrift']])
        kurz = escape_sql_string(row[col_indices['Kurzbezeichnung']])
        dialog = escape_sql_string(row[col_indices['DialogProzess']])
        fach = escape_sql_string(row[col_indices['Fachprozesse']])
        vordruck = escape_sql_string(row[col_indices['Vordruchnummer']])
        
        sql_statements.append(f"-- Datensatz {record_num}")
        sql_statements.append("DECLARE")
        sql_statements.append(f"    v_{bescheid_id_var} NUMBER;")
        sql_statements.append("BEGIN")
        
        # INSERT in BescheidTable
        sql_statements.append("    -- Insert in BescheidTable")
        sql_statements.append("    INSERT INTO BescheidTable (")
        sql_statements.append("        name_des_bescheides,")
        sql_statements.append("        kurzbezeichnung,")
        sql_statements.append("        dialog_prozess,")
        sql_statements.append("        auswahl_fachprozess")
        sql_statements.append("    ) VALUES (")
        sql_statements.append(f"        {name},")
        sql_statements.append(f"        {kurz},")
        sql_statements.append(f"        {dialog},")
        sql_statements.append(f"        {fach}")
        sql_statements.append("    ) RETURNING bescheid_id INTO v_" + bescheid_id_var + ";")
        sql_statements.append("")
        
        # INSERT in VordrucknummerTable
        sql_statements.append("    -- Insert in VordrucknummerTable")
        sql_statements.append("    INSERT INTO VordrucknummerTable (")
        sql_statements.append("        vordrucknummer,")
        sql_statements.append("        bescheid_id")
        sql_statements.append("    ) VALUES (")
        sql_statements.append(f"        {vordruck},")
        sql_statements.append(f"        v_{bescheid_id_var}")
        sql_statements.append("    );")
        sql_statements.append("")
        sql_statements.append("    COMMIT;")
        sql_statements.append("END;")
        sql_statements.append("/")
        sql_statements.append("")
    
    # Output schreiben
    output_text = "\n".join(sql_statements)
    
    if output_path:
        with open(output_path, 'w', encoding='utf-8') as f:
            f.write(output_text)
        print(f"SQL INSERT Statements geschrieben nach: {output_path}")
    else:
        print(output_text)
    
    return record_num


if __name__ == "__main__":
    # Pfade
    script_dir = os.path.dirname(os.path.abspath(__file__))
    csv_file = os.path.join(script_dir, "random_daten.csv")
    output_file = os.path.join(script_dir, "insert_statements.sql")
    
    # Optionale Kommandozeilen-Argumente
    if len(sys.argv) > 1:
        csv_file = sys.argv[1]
    if len(sys.argv) > 2:
        output_file = sys.argv[2]
    
    # Generieren
    print(f"Lese CSV-Datei: {csv_file}")
    num_records = generate_inserts(csv_file, output_file)
    print(f"\nFertig! {num_records} Datensätze verarbeitet.")
