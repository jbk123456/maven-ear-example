package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD4 {

    @EJB
    private HelperBeanC4 helperBeanC4;

    public String identify() {
        return "HelperBeanD4";
    }
}
