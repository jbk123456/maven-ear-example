package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD32 {

    @EJB
    private HelperBeanC32 helperBeanC32;

    public String identify() {
        return "HelperBeanD32";
    }
}
