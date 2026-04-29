package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD170 {

    @EJB
    private HelperBeanC170 helperBeanC170;

    public String identify() {
        return "HelperBeanD170";
    }
}
