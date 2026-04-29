package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD11 {

    @EJB
    private HelperBeanC11 helperBeanC11;

    public String identify() {
        return "HelperBeanD11";
    }
}
