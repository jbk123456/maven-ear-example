package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD6 {

    @EJB
    private HelperBeanC6 helperBeanC6;

    public String identify() {
        return "HelperBeanD6";
    }
}
