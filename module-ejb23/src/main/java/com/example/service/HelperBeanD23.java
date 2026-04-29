package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD23 {

    @EJB
    private HelperBeanC23 helperBeanC23;

    public String identify() {
        return "HelperBeanD23";
    }
}
