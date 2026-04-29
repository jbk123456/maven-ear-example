package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD50 {

    @EJB
    private HelperBeanC50 helperBeanC50;

    public String identify() {
        return "HelperBeanD50";
    }
}
