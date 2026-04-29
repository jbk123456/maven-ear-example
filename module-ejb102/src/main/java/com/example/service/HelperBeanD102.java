package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD102 {

    @EJB
    private HelperBeanC102 helperBeanC102;

    public String identify() {
        return "HelperBeanD102";
    }
}
