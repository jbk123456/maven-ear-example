package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN50 {

    @EJB
    private HelperBeanM50 helperBeanM50;

    public String identify() {
        return "HelperBeanN50";
    }
}
