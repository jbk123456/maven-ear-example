package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB12 {

    @EJB
    private HelperBeanA12 helperBeanA12;

    public String identify() {
        return "HelperBeanB12";
    }
}
