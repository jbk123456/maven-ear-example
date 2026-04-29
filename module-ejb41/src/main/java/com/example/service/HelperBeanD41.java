package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD41 {

    @EJB
    private HelperBeanC41 helperBeanC41;

    public String identify() {
        return "HelperBeanD41";
    }
}
