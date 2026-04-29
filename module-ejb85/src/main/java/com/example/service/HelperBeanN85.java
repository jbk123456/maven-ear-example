package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN85 {

    @EJB
    private HelperBeanM85 helperBeanM85;

    public String identify() {
        return "HelperBeanN85";
    }
}
