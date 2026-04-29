package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB134 {

    @EJB
    private HelperBeanA134 helperBeanA134;

    public String identify() {
        return "HelperBeanB134";
    }
}
