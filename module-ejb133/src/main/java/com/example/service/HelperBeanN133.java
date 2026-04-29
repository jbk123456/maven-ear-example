package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN133 {

    @EJB
    private HelperBeanM133 helperBeanM133;

    public String identify() {
        return "HelperBeanN133";
    }
}
