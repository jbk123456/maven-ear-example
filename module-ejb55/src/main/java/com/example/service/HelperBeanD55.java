package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD55 {

    @EJB
    private HelperBeanC55 helperBeanC55;

    public String identify() {
        return "HelperBeanD55";
    }
}
