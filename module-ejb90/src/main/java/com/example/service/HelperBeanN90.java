package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN90 {

    @EJB
    private HelperBeanM90 helperBeanM90;

    public String identify() {
        return "HelperBeanN90";
    }
}
