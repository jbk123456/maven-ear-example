package com.example.service.config;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class StringListConverterTest {

    private StringListConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new StringListConverter();
    }

    @Test
    public void testConvertSimpleCommaSeparatedString() {
        // Given
        String input = "apple,banana,cherry";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.size());
        assertEquals("First element should be 'apple'", "apple", result.get(0));
        assertEquals("Second element should be 'banana'", "banana", result.get(1));
        assertEquals("Third element should be 'cherry'", "cherry", result.get(2));
    }

    @Test
    public void testConvertWithWhitespace() {
        // Given
        String input = " apple , banana , cherry ";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.size());
        assertEquals("First element should be 'apple' (trimmed)", "apple", result.get(0));
        assertEquals("Second element should be 'banana' (trimmed)", "banana", result.get(1));
        assertEquals("Third element should be 'cherry' (trimmed)", "cherry", result.get(2));
    }

    @Test
    public void testConvertSingleValue() {
        // Given
        String input = "single";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 1 element", 1, result.size());
        assertEquals("Element should be 'single'", "single", result.get(0));
    }

    @Test
    public void testConvertEmptyString() {
        // Given
        String input = "";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertTrue("Result should be empty", result.isEmpty());
    }

    @Test
    public void testConvertWhitespaceOnlyString() {
        // Given
        String input = "   ";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertTrue("Result should be empty", result.isEmpty());
    }

    @Test
    public void testConvertNullValue() {
        // Given
        String input = null;
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertTrue("Result should be empty", result.isEmpty());
    }

    @Test
    public void testConvertWithEmptyValues() {
        // Given
        String input = "apple,,cherry";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.size());
        assertEquals("First element should be 'apple'", "apple", result.get(0));
        assertEquals("Second element should be empty", "", result.get(1));
        assertEquals("Third element should be 'cherry'", "cherry", result.get(2));
    }

    @Test
    public void testConvertWithOnlyCommas() {
        // Given
        String input = ",,";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 empty elements", 3, result.size());
        assertEquals("First element should be empty", "", result.get(0));
        assertEquals("Second element should be empty", "", result.get(1));
        assertEquals("Third element should be empty", "", result.get(2));
    }

    @Test
    public void testConvertWithTrailingComma() {
        // Given
        String input = "apple,banana,";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.size());
        assertEquals("First element should be 'apple'", "apple", result.get(0));
        assertEquals("Second element should be 'banana'", "banana", result.get(1));
        assertEquals("Third element should be empty", "", result.get(2));
    }

    @Test
    public void testConvertWithLeadingComma() {
        // Given
        String input = ",apple,banana";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.size());
        assertEquals("First element should be empty", "", result.get(0));
        assertEquals("Second element should be 'apple'", "apple", result.get(1));
        assertEquals("Third element should be 'banana'", "banana", result.get(2));
    }

    @Test
    public void testConvertWithSpecialCharacters() {
        // Given
        String input = "hello world,test@example.com,123-456";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then
        assertNotNull("Result should not be null", result);
        assertEquals("Should have 3 elements", 3, result.size());
        assertEquals("First element should be 'hello world'", "hello world", result.get(0));
        assertEquals("Second element should be 'test@example.com'", "test@example.com", result.get(1));
        assertEquals("Third element should be '123-456'", "123-456", result.get(2));
    }

    @Test
    public void testConvertResultIsModifiable() {
        // Given
        String input = "apple,banana";
        
        // When
        List<String> result = converter.convert(input);
        
        // Then - Should be able to modify the returned list
        assertNotNull("Result should not be null", result);
        result.add("cherry"); // This should not throw an exception
        assertEquals("Should have 3 elements after adding", 3, result.size());
        assertEquals("Added element should be 'cherry'", "cherry", result.get(2));
    }

    @Test
    public void testConverterImplementsConverter() {
        // Then
        assertTrue("Should implement Converter interface", 
                   converter instanceof org.eclipse.microprofile.config.spi.Converter);
    }
}