package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD53 {

    @EJB
    private HelperBeanC53 helperBeanC53;

    public String identify() {
        return "HelperBeanD53";
    }
}
