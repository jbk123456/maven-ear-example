package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN146 {

    @EJB
    private HelperBeanM146 helperBeanM146;

    public String identify() {
        return "HelperBeanN146";
    }
}
