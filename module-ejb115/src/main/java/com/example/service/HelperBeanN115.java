package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN115 {

    @EJB
    private HelperBeanM115 helperBeanM115;

    public String identify() {
        return "HelperBeanN115";
    }
}
