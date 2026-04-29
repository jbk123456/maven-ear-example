package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN175 {

    @EJB
    private HelperBeanM175 helperBeanM175;

    public String identify() {
        return "HelperBeanN175";
    }
}
