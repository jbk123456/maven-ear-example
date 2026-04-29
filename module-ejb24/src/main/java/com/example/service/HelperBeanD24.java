package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD24 {

    @EJB
    private HelperBeanC24 helperBeanC24;

    public String identify() {
        return "HelperBeanD24";
    }
}
