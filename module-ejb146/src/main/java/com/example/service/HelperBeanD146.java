package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD146 {

    @EJB
    private HelperBeanC146 helperBeanC146;

    public String identify() {
        return "HelperBeanD146";
    }
}
