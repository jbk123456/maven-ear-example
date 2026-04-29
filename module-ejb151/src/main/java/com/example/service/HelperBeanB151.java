package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB151 {

    @EJB
    private HelperBeanA151 helperBeanA151;

    public String identify() {
        return "HelperBeanB151";
    }
}
