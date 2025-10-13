package com.example.service.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class FileSystemConfigSource implements ConfigSource {
 
    private final String CONFIG_SOURCE_NAME = "FileSystemConfigSource";
    private final int ORDINAL = 50;
 
    private String fileConfig;
 
    @Override
    public Map getProperties() {
        Map res = getPropertiesInternal();
        System.out.println("FileSystemConfigSource.properties:::"+res);
        return res;
    }
 
    @Override
    public Set getPropertyNames() {
       return getProperties().keySet();
    }
 
    @Override
    public int getOrdinal() {
        return ORDINAL;
    }
 
    @Override
    public String getValue(String s) {
        return getPropertiesInternal().getProperty(s);

    }
 
    @Override
    public String getName() {
       return CONFIG_SOURCE_NAME;
    }
 
    private Properties getPropertiesInternal() {
        try(InputStream in = FileSystemConfigSource.class.getResourceAsStream("config.properties")){
 
            Properties properties = new Properties();
            properties.load( in );
            return properties;
         } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}