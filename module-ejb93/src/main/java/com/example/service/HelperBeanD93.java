package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD93 {

    @EJB
    private HelperBeanC93 helperBeanC93;

    public String identify() {
        return "HelperBeanD93";
    }
}
