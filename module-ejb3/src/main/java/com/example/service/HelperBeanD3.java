package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD3 {

    @EJB
    private HelperBeanC3 helperBeanC3;

    public String identify() {
        return "HelperBeanD3";
    }
}
