package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE101 {

    @EJB
    private HelperBeanD101 helperBeanD101;

    public String identify() {
        return "HelperBeanE101";
    }
}
