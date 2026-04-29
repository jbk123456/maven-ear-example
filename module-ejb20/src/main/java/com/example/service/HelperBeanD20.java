package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD20 {

    @EJB
    private HelperBeanC20 helperBeanC20;

    public String identify() {
        return "HelperBeanD20";
    }
}
