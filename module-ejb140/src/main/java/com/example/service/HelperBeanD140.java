package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD140 {

    @EJB
    private HelperBeanC140 helperBeanC140;

    public String identify() {
        return "HelperBeanD140";
    }
}
