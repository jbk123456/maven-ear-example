package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN26 {

    @EJB
    private HelperBeanM26 helperBeanM26;

    public String identify() {
        return "HelperBeanN26";
    }
}
