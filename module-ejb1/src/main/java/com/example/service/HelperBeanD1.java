package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD1 {

    @EJB
    private HelperBeanC1 helperBeanC1;

    public String identify() {
        return "HelperBeanD1";
    }
}
