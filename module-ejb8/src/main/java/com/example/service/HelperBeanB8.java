package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB8 {

    @EJB
    private HelperBeanA8 helperBeanA8;

    public String identify() {
        return "HelperBeanB8";
    }
}
