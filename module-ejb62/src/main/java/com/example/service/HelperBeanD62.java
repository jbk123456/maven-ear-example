package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD62 {

    @EJB
    private HelperBeanC62 helperBeanC62;

    public String identify() {
        return "HelperBeanD62";
    }
}
