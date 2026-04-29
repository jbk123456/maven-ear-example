package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM53 {

    @EJB
    private HelperBeanL53 helperBeanL53;

    public String identify() {
        return "HelperBeanM53";
    }
}
