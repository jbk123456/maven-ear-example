package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC48 {

    @EJB
    private HelperBeanB48 helperBeanB48;

    public String identify() {
        return "HelperBeanC48";
    }
}
