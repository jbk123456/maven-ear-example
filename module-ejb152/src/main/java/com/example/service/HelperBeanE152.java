package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE152 {

    @EJB
    private HelperBeanD152 helperBeanD152;

    public String identify() {
        return "HelperBeanE152";
    }
}
