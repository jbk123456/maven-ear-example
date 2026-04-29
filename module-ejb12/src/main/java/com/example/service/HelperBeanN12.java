package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN12 {

    @EJB
    private HelperBeanM12 helperBeanM12;

    public String identify() {
        return "HelperBeanN12";
    }
}
