package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN1 {

    @EJB
    private HelperBeanM1 helperBeanM1;

    public String identify() {
        return "HelperBeanN1";
    }
}
