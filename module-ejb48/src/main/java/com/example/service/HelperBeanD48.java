package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD48 {

    @EJB
    private HelperBeanC48 helperBeanC48;

    public String identify() {
        return "HelperBeanD48";
    }
}
