package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD152 {

    @EJB
    private HelperBeanC152 helperBeanC152;

    public String identify() {
        return "HelperBeanD152";
    }
}
