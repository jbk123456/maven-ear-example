package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE146 {

    @EJB
    private HelperBeanD146 helperBeanD146;

    public String identify() {
        return "HelperBeanE146";
    }
}
