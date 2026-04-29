package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN132 {

    @EJB
    private HelperBeanM132 helperBeanM132;

    public String identify() {
        return "HelperBeanN132";
    }
}
