package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD65 {

    @EJB
    private HelperBeanC65 helperBeanC65;

    public String identify() {
        return "HelperBeanD65";
    }
}
