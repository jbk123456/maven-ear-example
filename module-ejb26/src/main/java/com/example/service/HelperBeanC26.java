package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC26 {

    @EJB
    private HelperBeanB26 helperBeanB26;

    public String identify() {
        return "HelperBeanC26";
    }
}
