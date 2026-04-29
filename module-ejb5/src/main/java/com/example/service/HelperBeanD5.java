package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD5 {

    @EJB
    private HelperBeanC5 helperBeanC5;

    public String identify() {
        return "HelperBeanD5";
    }
}
