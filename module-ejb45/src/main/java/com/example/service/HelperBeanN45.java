package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN45 {

    @EJB
    private HelperBeanM45 helperBeanM45;

    public String identify() {
        return "HelperBeanN45";
    }
}
