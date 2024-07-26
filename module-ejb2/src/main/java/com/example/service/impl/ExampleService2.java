package com.example.service.impl;

import javax.ejb.Stateless;

import com.example.service.IExampleService2;
import com.example.to.ExampleTO2;

@Stateless
public class ExampleService2 implements IExampleService2 {

    @Override
    public String whoAmI(ExampleTO2 to) {
        return "i'm an ExampleService";
    }

}
