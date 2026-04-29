package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN99 {

    @EJB
    private HelperBeanM99 helperBeanM99;

    public String identify() {
        return "HelperBeanN99";
    }
}
