package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD75 {

    @EJB
    private HelperBeanC75 helperBeanC75;

    public String identify() {
        return "HelperBeanD75";
    }
}
