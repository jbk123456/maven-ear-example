package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD27 {

    @EJB
    private HelperBeanC27 helperBeanC27;

    public String identify() {
        return "HelperBeanD27";
    }
}
