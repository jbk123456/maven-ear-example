package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE160 {

    @EJB
    private HelperBeanD160 helperBeanD160;

    public String identify() {
        return "HelperBeanE160";
    }
}
