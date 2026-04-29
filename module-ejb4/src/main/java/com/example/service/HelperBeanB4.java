package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB4 {

    @EJB
    private HelperBeanA4 helperBeanA4;

    public String identify() {
        return "HelperBeanB4";
    }
}
