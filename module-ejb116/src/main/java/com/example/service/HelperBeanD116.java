package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD116 {

    @EJB
    private HelperBeanC116 helperBeanC116;

    public String identify() {
        return "HelperBeanD116";
    }
}
