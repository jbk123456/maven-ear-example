package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN4 {

    @EJB
    private HelperBeanM4 helperBeanM4;

    public String identify() {
        return "HelperBeanN4";
    }
}
