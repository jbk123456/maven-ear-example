package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN32 {

    @EJB
    private HelperBeanM32 helperBeanM32;

    public String identify() {
        return "HelperBeanN32";
    }
}
