package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD109 {

    @EJB
    private HelperBeanC109 helperBeanC109;

    public String identify() {
        return "HelperBeanD109";
    }
}
