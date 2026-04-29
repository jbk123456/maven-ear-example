package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD92 {

    @EJB
    private HelperBeanC92 helperBeanC92;

    public String identify() {
        return "HelperBeanD92";
    }
}
