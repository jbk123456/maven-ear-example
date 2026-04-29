package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD156 {

    @EJB
    private HelperBeanC156 helperBeanC156;

    public String identify() {
        return "HelperBeanD156";
    }
}
