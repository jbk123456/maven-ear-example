package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD165 {

    @EJB
    private HelperBeanC165 helperBeanC165;

    public String identify() {
        return "HelperBeanD165";
    }
}
