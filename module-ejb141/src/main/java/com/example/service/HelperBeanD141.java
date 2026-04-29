package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD141 {

    @EJB
    private HelperBeanC141 helperBeanC141;

    public String identify() {
        return "HelperBeanD141";
    }
}
