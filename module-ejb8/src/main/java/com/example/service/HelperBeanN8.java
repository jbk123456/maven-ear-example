package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN8 {

    @EJB
    private HelperBeanM8 helperBeanM8;

    public String identify() {
        return "HelperBeanN8";
    }
}
