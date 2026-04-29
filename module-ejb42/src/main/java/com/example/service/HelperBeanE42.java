package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE42 {

    @EJB
    private HelperBeanD42 helperBeanD42;

    public String identify() {
        return "HelperBeanE42";
    }
}
