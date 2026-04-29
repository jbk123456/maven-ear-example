package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD134 {

    @EJB
    private HelperBeanC134 helperBeanC134;

    public String identify() {
        return "HelperBeanD134";
    }
}
