package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN7 {

    @EJB
    private HelperBeanM7 helperBeanM7;

    public String identify() {
        return "HelperBeanN7";
    }
}
