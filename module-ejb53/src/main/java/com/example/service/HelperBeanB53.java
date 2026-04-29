package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB53 {

    @EJB
    private HelperBeanA53 helperBeanA53;

    public String identify() {
        return "HelperBeanB53";
    }
}
