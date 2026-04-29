package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE12 {

    @EJB
    private HelperBeanD12 helperBeanD12;

    public String identify() {
        return "HelperBeanE12";
    }
}
