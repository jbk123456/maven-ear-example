package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN49 {

    @EJB
    private HelperBeanM49 helperBeanM49;

    public String identify() {
        return "HelperBeanN49";
    }
}
