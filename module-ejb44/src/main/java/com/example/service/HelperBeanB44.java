package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB44 {

    @EJB
    private HelperBeanA44 helperBeanA44;

    public String identify() {
        return "HelperBeanB44";
    }
}
