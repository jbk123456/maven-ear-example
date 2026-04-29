package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD100 {

    @EJB
    private HelperBeanC100 helperBeanC100;

    public String identify() {
        return "HelperBeanD100";
    }
}
