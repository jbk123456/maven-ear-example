package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB173 {

    @EJB
    private HelperBeanA173 helperBeanA173;

    public String identify() {
        return "HelperBeanB173";
    }
}
