package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD42 {

    @EJB
    private HelperBeanC42 helperBeanC42;

    public String identify() {
        return "HelperBeanD42";
    }
}
