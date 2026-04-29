package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN20 {

    @EJB
    private HelperBeanM20 helperBeanM20;

    public String identify() {
        return "HelperBeanN20";
    }
}
