package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC3 {

    @EJB
    private HelperBeanB3 helperBeanB3;

    public String identify() {
        return "HelperBeanC3";
    }
}
