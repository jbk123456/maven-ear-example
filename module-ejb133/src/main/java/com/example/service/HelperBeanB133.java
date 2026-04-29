package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB133 {

    @EJB
    private HelperBeanA133 helperBeanA133;

    public String identify() {
        return "HelperBeanB133";
    }
}
