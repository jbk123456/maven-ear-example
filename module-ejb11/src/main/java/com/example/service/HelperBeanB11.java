package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB11 {

    @EJB
    private HelperBeanA11 helperBeanA11;

    public String identify() {
        return "HelperBeanB11";
    }
}
