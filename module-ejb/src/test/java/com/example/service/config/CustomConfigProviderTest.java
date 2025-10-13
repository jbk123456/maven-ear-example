package com.example.service.config;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.microprofile.config.spi.ConfigSource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CustomConfigProviderTest {

    private CustomConfigProvider configProvider;
    private String originalConfigEnabledProperty;
    private String originalRefreshRateProperty;

    @Before
    public void setUp() throws Exception {
        configProvider = new CustomConfigProvider();
        
        // Store original system properties to restore them later
        originalConfigEnabledProperty = System.getProperty("configenabled");
        originalRefreshRateProperty = System.getProperty("microprofile.config.refresh.rate");
    }

    @After
    public void tearDown() throws Exception {
        // Restore original system properties
        if (originalConfigEnabledProperty != null) {
            System.setProperty("configenabled", originalConfigEnabledProperty);
        } else {
            System.clearProperty("configenabled");
        }
        
        if (originalRefreshRateProperty != null) {
            System.setProperty("microprofile.config.refresh.rate", originalRefreshRateProperty);
        } else {
            System.clearProperty("microprofile.config.refresh.rate");
        }
    }

    @Test
    public void testGetConfigSourcesReturnsNonNullIterable() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then
        assertNotNull("ConfigSources should not be null", configSources);
    }

    @Test
    public void testGetConfigSourcesReturnsCorrectNumberOfSources() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then - Convert to list to check size
        List<ConfigSource> sourceList = new ArrayList<>();
        configSources.forEach(sourceList::add);
        
        // FileSystemConfigSource is always added, CustomConfigSource1 and CustomConfigSource2 
        // are only added if enabled
        assertTrue("Should have at least 1 config source (FileSystemConfigSource)", 
                   sourceList.size() >= 1);
        assertTrue("Should have at most 3 config sources", sourceList.size() <= 3);
    }

    @Test
    public void testGetConfigSourcesWithNoEnabledSources() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.clearProperty("configenabled"); // Ensure no sources are enabled
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then
        List<ConfigSource> sourceList = new ArrayList<>();
        configSources.forEach(sourceList::add);
        
        // Only FileSystemConfigSource should be present
        assertEquals("Should have exactly 1 config source (FileSystemConfigSource)", 
                     1, sourceList.size());
        
        ConfigSource source = sourceList.get(0);
        assertEquals("Should be FileSystemConfigSource", 
                     "FileSystemConfigSource", source.getName());
    }

    @Test
    public void testGetConfigSourcesWithCustomConfigSource1Enabled() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.setProperty("configenabled", "CustomConfigSource1");
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then
        List<ConfigSource> sourceList = new ArrayList<>();
        configSources.forEach(sourceList::add);
        
        // Should have CustomConfigSource1 and FileSystemConfigSource
        assertEquals("Should have exactly 2 config sources", 2, sourceList.size());
        
        // Check that CustomConfigSource1 is present
        boolean hasCustomConfigSource1 = sourceList.stream()
                .anyMatch(source -> "CustomConfigSource1".equals(source.getName()));
        assertTrue("Should contain CustomConfigSource1", hasCustomConfigSource1);
        
        // Check that FileSystemConfigSource is present
        boolean hasFileSystemConfigSource = sourceList.stream()
                .anyMatch(source -> "FileSystemConfigSource".equals(source.getName()));
        assertTrue("Should contain FileSystemConfigSource", hasFileSystemConfigSource);
    }

    @Test
    public void testGetConfigSourcesWithCustomConfigSource2Enabled() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.setProperty("configenabled", "CustomConfigSource2");
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then
        List<ConfigSource> sourceList = new ArrayList<>();
        configSources.forEach(sourceList::add);
        
        // Should have CustomConfigSource2 and FileSystemConfigSource
        assertEquals("Should have exactly 2 config sources", 2, sourceList.size());
        
        // Check that CustomConfigSource2 is present
        boolean hasCustomConfigSource2 = sourceList.stream()
                .anyMatch(source -> "CustomConfigSource2".equals(source.getName()));
        assertTrue("Should contain CustomConfigSource2", hasCustomConfigSource2);
        
        // Check that FileSystemConfigSource is present
        boolean hasFileSystemConfigSource = sourceList.stream()
                .anyMatch(source -> "FileSystemConfigSource".equals(source.getName()));
        assertTrue("Should contain FileSystemConfigSource", hasFileSystemConfigSource);
    }

    @Test
    public void testGetConfigSourcesWithBothCustomSourcesEnabled() {
        // Given - This test simulates a scenario where configenabled matches both sources
        // In practice, this might not happen since both check for exact match with their name
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        
        // Test with first source enabled
        System.setProperty("configenabled", "CustomConfigSource1");
        Iterable<ConfigSource> configSources1 = configProvider.getConfigSources(classLoader);
        List<ConfigSource> sourceList1 = new ArrayList<>();
        configSources1.forEach(sourceList1::add);
        
        // Test with second source enabled
        System.setProperty("configenabled", "CustomConfigSource2");
        Iterable<ConfigSource> configSources2 = configProvider.getConfigSources(classLoader);
        List<ConfigSource> sourceList2 = new ArrayList<>();
        configSources2.forEach(sourceList2::add);
        
        // Then
        assertEquals("Should have 2 sources when CustomConfigSource1 is enabled", 
                     2, sourceList1.size());
        assertEquals("Should have 2 sources when CustomConfigSource2 is enabled", 
                     2, sourceList2.size());
    }

    @Test
    public void testMicroprofileConfigRefreshRatePropertyIsSet() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.clearProperty("microprofile.config.refresh.rate"); // Clear existing value
        
        // When
        configProvider.getConfigSources(classLoader);
        
        // Then
        String refreshRate = System.getProperty("microprofile.config.refresh.rate");
        assertNotNull("microprofile.config.refresh.rate should be set", refreshRate);
        assertEquals("Should have default value", "1000", refreshRate);
    }

    @Test
    public void testMicroprofileConfigRefreshRatePropertyIsPreserved() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String existingValue = "5000";
        System.setProperty("microprofile.config.refresh.rate", existingValue);
        
        // When
        configProvider.getConfigSources(classLoader);
        
        // Then
        String refreshRate = System.getProperty("microprofile.config.refresh.rate");
        assertEquals("Existing value should be preserved", existingValue, refreshRate);
    }

    @Test
    public void testFileSystemConfigSourceAlwaysIncluded() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then
        List<ConfigSource> sourceList = new ArrayList<>();
        configSources.forEach(sourceList::add);
        
        boolean hasFileSystemConfigSource = sourceList.stream()
                .anyMatch(source -> "FileSystemConfigSource".equals(source.getName()));
        assertTrue("FileSystemConfigSource should always be included", hasFileSystemConfigSource);
    }

    @Test
    public void testConfigSourcesHaveCorrectTypes() {
        // Given
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.setProperty("configenabled", "CustomConfigSource1");
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then
        for (ConfigSource source : configSources) {
            assertNotNull("ConfigSource should not be null", source);
            assertNotNull("ConfigSource name should not be null", source.getName());
            assertTrue("ConfigSource ordinal should be non-negative", source.getOrdinal() >= 0);
        }
    }

    @Test
    public void testGetConfigSourcesWithNullClassLoader() {
        // Given - null ClassLoader
        ClassLoader classLoader = null;
        
        // When
        Iterable<ConfigSource> configSources = configProvider.getConfigSources(classLoader);
        
        // Then - Should still work and return config sources
        assertNotNull("Should handle null ClassLoader gracefully", configSources);
        
        List<ConfigSource> sourceList = new ArrayList<>();
        configSources.forEach(sourceList::add);
        assertTrue("Should have at least FileSystemConfigSource", sourceList.size() >= 1);
    }

    @Test
    public void testConfigProviderImplementsConfigSourceProvider() {
        // Then
        assertTrue("CustomConfigProvider should implement ConfigSourceProvider", 
                   configProvider instanceof org.eclipse.microprofile.config.spi.ConfigSourceProvider);
    }
}