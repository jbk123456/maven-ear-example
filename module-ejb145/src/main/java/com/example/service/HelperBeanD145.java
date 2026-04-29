package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD145 {

    @EJB
    private HelperBeanC145 helperBeanC145;

    public String identify() {
        return "HelperBeanD145";
    }
}
