package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN75 {

    @EJB
    private HelperBeanM75 helperBeanM75;

    public String identify() {
        return "HelperBeanN75";
    }
}
