package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN62 {

    @EJB
    private HelperBeanM62 helperBeanM62;

    public String identify() {
        return "HelperBeanN62";
    }
}
