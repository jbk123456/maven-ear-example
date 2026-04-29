package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN3 {

    @EJB
    private HelperBeanM3 helperBeanM3;

    public String identify() {
        return "HelperBeanN3";
    }
}
