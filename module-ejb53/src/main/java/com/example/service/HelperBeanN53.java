package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN53 {

    @EJB
    private HelperBeanM53 helperBeanM53;

    public String identify() {
        return "HelperBeanN53";
    }
}
