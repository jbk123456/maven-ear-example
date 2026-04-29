package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB3 {

    @EJB
    private HelperBeanA3 helperBeanA3;

    public String identify() {
        return "HelperBeanB3";
    }
}
