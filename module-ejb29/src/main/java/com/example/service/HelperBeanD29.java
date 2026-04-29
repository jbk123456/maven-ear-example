package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD29 {

    @EJB
    private HelperBeanC29 helperBeanC29;

    public String identify() {
        return "HelperBeanD29";
    }
}
