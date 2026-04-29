package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD9 {

    @EJB
    private HelperBeanC9 helperBeanC9;

    public String identify() {
        return "HelperBeanD9";
    }
}
