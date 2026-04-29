package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB123 {

    @EJB
    private HelperBeanA123 helperBeanA123;

    public String identify() {
        return "HelperBeanB123";
    }
}
