package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE65 {

    @EJB
    private HelperBeanD65 helperBeanD65;

    public String identify() {
        return "HelperBeanE65";
    }
}
