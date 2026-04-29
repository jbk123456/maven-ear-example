package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC5 {

    @EJB
    private HelperBeanB5 helperBeanB5;

    public String identify() {
        return "HelperBeanC5";
    }
}
