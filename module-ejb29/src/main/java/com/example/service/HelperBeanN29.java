package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN29 {

    @EJB
    private HelperBeanM29 helperBeanM29;

    public String identify() {
        return "HelperBeanN29";
    }
}
