package com.example.service.config;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class StringListConverterIntegrationTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testConverterWithMicroProfileConfig() {
         StringListConverter converter = new StringListConverter();
        
        String configValue = "user1,user2,user3";
        List<String> result = converter.convert(configValue);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 users", 3, result.size());
        assertEquals("First user should be 'user1'", "user1", result.get(0));
        assertEquals("Second user should be 'user2'", "user2", result.get(1));
        assertEquals("Third user should be 'user3'", "user3", result.get(2));
    }

    @Test
    public void testConverterWithSpacesAroundValues() {
        StringListConverter converter = new StringListConverter();
        
        String configValue = " value1 , value2 , value3 ";
        List<String> result = converter.convert(configValue);
        
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 values", 3, result.size());
        assertEquals("First value should be trimmed", "value1", result.get(0));
        assertEquals("Second value should be trimmed", "value2", result.get(1));
        assertEquals("Third value should be trimmed", "value3", result.get(2));
    }

    @Test
    public void testConverterWithRealWorldScenarios() {
        StringListConverter converter = new StringListConverter();
        
        String serverHosts = "localhost:8080,server1.example.com:8080,server2.example.com:8080";
        List<String> hosts = converter.convert(serverHosts);
        assertEquals("Should have 3 server hosts", 3, hosts.size());
        assertTrue("Should contain localhost", hosts.contains("localhost:8080"));
        assertTrue("Should contain server1", hosts.contains("server1.example.com:8080"));
        
        String features = "FEATURE_A,FEATURE_B,FEATURE_C";
        List<String> featureList = converter.convert(features);
        assertEquals("Should have 3 features", 3, featureList.size());
        assertTrue("Should contain FEATURE_A", featureList.contains("FEATURE_A"));
        
        String emails = "admin@example.com,support@example.com,noreply@example.com";
        List<String> emailList = converter.convert(emails);
        assertEquals("Should have 3 emails", 3, emailList.size());
        assertTrue("Should contain admin email", emailList.contains("admin@example.com"));
    }

    @Test
    public void testConverterWithEmptyConfiguration() {
        StringListConverter converter = new StringListConverter();
        
        List<String> emptyResult = converter.convert("");
        assertTrue("Empty string should return empty list", emptyResult.isEmpty());
        
        List<String> nullResult = converter.convert(null);
        assertTrue("Null should return empty list", nullResult.isEmpty());
    }

    @Test
    public void testConverterPerformance() {
        StringListConverter converter = new StringListConverter();
        
        StringBuilder largeConfig = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            if (i > 0) largeConfig.append(",");
            largeConfig.append("item").append(i);
        }
        
        long startTime = System.currentTimeMillis();
        List<String> result = converter.convert(largeConfig.toString());
        long endTime = System.currentTimeMillis();
        
        assertEquals("Should have 1000 items", 1000, result.size());
        assertTrue("Conversion should be fast (< 100ms)", (endTime - startTime) < 100);
        assertEquals("First item should be item0", "item0", result.get(0));
        assertEquals("Last item should be item999", "item999", result.get(999));
    }
}