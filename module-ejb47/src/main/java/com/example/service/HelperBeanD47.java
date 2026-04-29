package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD47 {

    @EJB
    private HelperBeanC47 helperBeanC47;

    public String identify() {
        return "HelperBeanD47";
    }
}
