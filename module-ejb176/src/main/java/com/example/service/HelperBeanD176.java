package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD176 {

    @EJB
    private HelperBeanC176 helperBeanC176;

    public String identify() {
        return "HelperBeanD176";
    }
}
