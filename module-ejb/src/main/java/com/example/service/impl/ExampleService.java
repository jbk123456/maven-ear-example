package com.example.service.impl;

import javax.ejb.Stateless;

import com.example.service.IExampleService;
import com.example.to.ExampleTO;

@Stateless
public class ExampleService implements IExampleService {

    @Override
    public String whoAmI(ExampleTO to) {
        //Gson gson = new Gson();
        return "i'm an ExampleService";// + gson.hashCode();
    }

}
