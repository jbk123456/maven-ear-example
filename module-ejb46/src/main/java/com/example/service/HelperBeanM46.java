package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM46 {

    @EJB
    private HelperBeanL46 helperBeanL46;

    public String identify() {
        return "HelperBeanM46";
    }
}
