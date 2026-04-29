package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM32 {

    @EJB
    private HelperBeanL32 helperBeanL32;

    public String identify() {
        return "HelperBeanM32";
    }
}
