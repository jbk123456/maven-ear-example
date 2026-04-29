package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN6 {

    @EJB
    private HelperBeanM6 helperBeanM6;

    public String identify() {
        return "HelperBeanN6";
    }
}
