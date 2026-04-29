package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE10 {

    @EJB
    private HelperBeanD10 helperBeanD10;

    public String identify() {
        return "HelperBeanE10";
    }
}
