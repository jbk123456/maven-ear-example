package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD133 {

    @EJB
    private HelperBeanC133 helperBeanC133;

    public String identify() {
        return "HelperBeanD133";
    }
}
