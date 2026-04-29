package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB58 {

    @EJB
    private HelperBeanA58 helperBeanA58;

    public String identify() {
        return "HelperBeanB58";
    }
}
