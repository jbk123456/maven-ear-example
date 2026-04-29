package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE20 {

    @EJB
    private HelperBeanD20 helperBeanD20;

    public String identify() {
        return "HelperBeanE20";
    }
}
