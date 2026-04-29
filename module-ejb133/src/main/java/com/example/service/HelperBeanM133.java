package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM133 {

    @EJB
    private HelperBeanL133 helperBeanL133;

    public String identify() {
        return "HelperBeanM133";
    }
}
