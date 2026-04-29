package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD123 {

    @EJB
    private HelperBeanC123 helperBeanC123;

    public String identify() {
        return "HelperBeanD123";
    }
}
