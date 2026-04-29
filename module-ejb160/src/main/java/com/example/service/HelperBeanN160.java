package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN160 {

    @EJB
    private HelperBeanM160 helperBeanM160;

    public String identify() {
        return "HelperBeanN160";
    }
}
