package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB137 {

    @EJB
    private HelperBeanA137 helperBeanA137;

    public String identify() {
        return "HelperBeanB137";
    }
}
