#!/usr/bin/env groovy
pipeline {
    
  agent any
  stages {
    stage('clone') {
      steps {
          echo 'hello'
          checkout scm

      }
    }
    stage('install') {
      steps {
          echo 'hi'
          sh'pwd'
          sh'ls -l'
          sh'java -version'
          echo 'hamdi'
          sh 'mvn clean install -Dmaven.test.skip=true'
          

      }
    }
   stage('xld step') {
            steps {

                
                sh '''
                
                  mkdir target
                  dest="target" 
                  version="1.0-SNAPSHOT"
                  archive='ear'
                  regex='\\.$archive\"$'

                  grep $regex applications.yaml
                  deployables=$(grep '\\.$archive"$' applications.yaml | sed 's/.*\\/\\([^/]*\\)\\.$archive".*/\\1/')
                  deployablesWithversion=$(echo "$deployables" | sed "s/@version@/$version/")
                  echo " ${deployablesWithversion}"
                  for file in $deployablesWithversion; do
                    found=$(find  -name "${file}.${archive}")
                    # Vérifier si le fichier a été trouvé
                    if [ -z "$found" ]; then
                        echo "Le fichier n'a pas été trouvé."
                    else
                        # Déplacer le fichier trouvé vers le dossier spécifié
                        mv "$found" "$dest"
                        echo "Le fichier a été déplacé avec succès."
                    fi
                  done
                  
                  sed -i "s/@version@/$version/g" applications.yaml
                  cat applications.yaml
                  
                  
                '''
                /*sh '''
                mkdir target
                grep -oP "<module>\\K.*?(?=</module>)" pom.xml
                modules=$(grep -oP "<module>\\K.*?(?=</module>)" pom.xml)
                echo " ${modules}"
                for module in $modules; do
                  echo "hamdi ${module} "
                  find ${module}/target -type f -name "${module}*.ear"
                  find ${module}/target -type f -name "${module}*.war"
                  
                done
               
                

                '''
                 sh ''' 
                 touch listing.txt
                 cat test.log | tee -a listing.txt
                

                 grep -m 1 "Creating CI Applications/*" listing.txt | grep -oP "Applications/[^/]+/[^/]+"
                
                 
                 '''*/
                
            }
        }
       
    }
  }

