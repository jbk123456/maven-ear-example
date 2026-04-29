package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD71 {

    @EJB
    private HelperBeanC71 helperBeanC71;

    public String identify() {
        return "HelperBeanD71";
    }
}
