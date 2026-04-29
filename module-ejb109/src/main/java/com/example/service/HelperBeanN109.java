package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN109 {

    @EJB
    private HelperBeanM109 helperBeanM109;

    public String identify() {
        return "HelperBeanN109";
    }
}
