package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE11 {

    @EJB
    private HelperBeanD11 helperBeanD11;

    public String identify() {
        return "HelperBeanE11";
    }
}
