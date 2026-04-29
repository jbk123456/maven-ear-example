package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN5 {

    @EJB
    private HelperBeanM5 helperBeanM5;

    public String identify() {
        return "HelperBeanN5";
    }
}
