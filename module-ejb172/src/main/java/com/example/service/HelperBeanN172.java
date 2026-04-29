package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN172 {

    @EJB
    private HelperBeanM172 helperBeanM172;

    public String identify() {
        return "HelperBeanN172";
    }
}
