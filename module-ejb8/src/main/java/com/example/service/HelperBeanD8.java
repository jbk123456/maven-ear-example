package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD8 {

    @EJB
    private HelperBeanC8 helperBeanC8;

    public String identify() {
        return "HelperBeanD8";
    }
}
