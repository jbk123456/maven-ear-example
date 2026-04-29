package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB6 {

    @EJB
    private HelperBeanA6 helperBeanA6;

    public String identify() {
        return "HelperBeanB6";
    }
}
