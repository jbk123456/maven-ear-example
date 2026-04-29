package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD2 {

    @EJB
    private HelperBeanC2 helperBeanC2;

    public String identify() {
        return "HelperBeanD2";
    }
}
