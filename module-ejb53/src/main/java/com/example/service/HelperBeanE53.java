package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE53 {

    @EJB
    private HelperBeanD53 helperBeanD53;

    public String identify() {
        return "HelperBeanE53";
    }
}
