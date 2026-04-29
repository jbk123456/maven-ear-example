package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD106 {

    @EJB
    private HelperBeanC106 helperBeanC106;

    public String identify() {
        return "HelperBeanD106";
    }
}
