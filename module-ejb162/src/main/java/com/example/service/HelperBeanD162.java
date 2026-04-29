package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD162 {

    @EJB
    private HelperBeanC162 helperBeanC162;

    public String identify() {
        return "HelperBeanD162";
    }
}
