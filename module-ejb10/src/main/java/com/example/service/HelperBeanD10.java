package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD10 {

    @EJB
    private HelperBeanC10 helperBeanC10;

    public String identify() {
        return "HelperBeanD10";
    }
}
