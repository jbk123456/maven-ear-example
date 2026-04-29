package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD149 {

    @EJB
    private HelperBeanC149 helperBeanC149;

    public String identify() {
        return "HelperBeanD149";
    }
}
