package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN156 {

    @EJB
    private HelperBeanM156 helperBeanM156;

    public String identify() {
        return "HelperBeanN156";
    }
}
