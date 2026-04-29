package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB48 {

    @EJB
    private HelperBeanA48 helperBeanA48;

    public String identify() {
        return "HelperBeanB48";
    }
}
