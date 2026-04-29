package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD169 {

    @EJB
    private HelperBeanC169 helperBeanC169;

    public String identify() {
        return "HelperBeanD169";
    }
}
