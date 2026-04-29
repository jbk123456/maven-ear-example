package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN124 {

    @EJB
    private HelperBeanM124 helperBeanM124;

    public String identify() {
        return "HelperBeanN124";
    }
}
