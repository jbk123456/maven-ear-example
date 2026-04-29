package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC149 {

    @EJB
    private HelperBeanB149 helperBeanB149;

    public String identify() {
        return "HelperBeanC149";
    }
}
