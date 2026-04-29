package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB170 {

    @EJB
    private HelperBeanA170 helperBeanA170;

    public String identify() {
        return "HelperBeanB170";
    }
}
