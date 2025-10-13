package com.example.service.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.microprofile.config.spi.Converter;


public class StringListConverter implements Converter<List<String>> {

    @Override
    public List<String> convert(String value) {
        if (value == null) {
            return Collections.emptyList();
        }
        
        if (value.trim().isEmpty()) {
            return Collections.emptyList();
        }
        
        return Arrays.stream(value.split(",", -1)) // -1 to keep trailing empty strings
                .map(String::trim)
                .collect(Collectors.toList());
    }
}