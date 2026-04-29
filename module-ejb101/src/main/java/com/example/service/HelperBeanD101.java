package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD101 {

    @EJB
    private HelperBeanC101 helperBeanC101;

    public String identify() {
        return "HelperBeanD101";
    }
}
