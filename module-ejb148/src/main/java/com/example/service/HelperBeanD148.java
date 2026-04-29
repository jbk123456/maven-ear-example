package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD148 {

    @EJB
    private HelperBeanC148 helperBeanC148;

    public String identify() {
        return "HelperBeanD148";
    }
}
