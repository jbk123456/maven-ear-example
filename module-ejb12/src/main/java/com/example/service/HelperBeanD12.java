package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD12 {

    @EJB
    private HelperBeanC12 helperBeanC12;

    public String identify() {
        return "HelperBeanD12";
    }
}
