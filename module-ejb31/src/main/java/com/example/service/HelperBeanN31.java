package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN31 {

    @EJB
    private HelperBeanM31 helperBeanM31;

    public String identify() {
        return "HelperBeanN31";
    }
}
