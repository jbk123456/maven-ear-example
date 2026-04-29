package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB128 {

    @EJB
    private HelperBeanA128 helperBeanA128;

    public String identify() {
        return "HelperBeanB128";
    }
}
