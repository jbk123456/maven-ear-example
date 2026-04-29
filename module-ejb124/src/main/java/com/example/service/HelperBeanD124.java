package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD124 {

    @EJB
    private HelperBeanC124 helperBeanC124;

    public String identify() {
        return "HelperBeanD124";
    }
}
