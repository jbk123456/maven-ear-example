package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB1 {

    @EJB
    private HelperBeanA1 helperBeanA1;

    public String identify() {
        return "HelperBeanB1";
    }
}
