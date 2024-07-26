package com.example.to;

import java.io.Serializable;

public class ExampleTO2 implements Serializable{
    private String someString;

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }
    
}
