package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD86 {

    @EJB
    private HelperBeanC86 helperBeanC86;

    public String identify() {
        return "HelperBeanD86";
    }
}
