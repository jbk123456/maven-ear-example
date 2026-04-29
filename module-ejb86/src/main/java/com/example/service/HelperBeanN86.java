package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN86 {

    @EJB
    private HelperBeanM86 helperBeanM86;

    public String identify() {
        return "HelperBeanN86";
    }
}
