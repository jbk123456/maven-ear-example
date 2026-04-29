package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE109 {

    @EJB
    private HelperBeanD109 helperBeanD109;

    public String identify() {
        return "HelperBeanE109";
    }
}
