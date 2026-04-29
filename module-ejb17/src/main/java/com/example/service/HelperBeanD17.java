package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD17 {

    @EJB
    private HelperBeanC17 helperBeanC17;

    public String identify() {
        return "HelperBeanD17";
    }
}
