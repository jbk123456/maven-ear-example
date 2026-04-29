package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC6 {

    @EJB
    private HelperBeanB6 helperBeanB6;

    public String identify() {
        return "HelperBeanC6";
    }
}
