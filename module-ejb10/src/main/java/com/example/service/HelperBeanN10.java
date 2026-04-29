package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN10 {

    @EJB
    private HelperBeanM10 helperBeanM10;

    public String identify() {
        return "HelperBeanN10";
    }
}
