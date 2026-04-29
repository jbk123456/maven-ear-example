package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB23 {

    @EJB
    private HelperBeanA23 helperBeanA23;

    public String identify() {
        return "HelperBeanB23";
    }
}
