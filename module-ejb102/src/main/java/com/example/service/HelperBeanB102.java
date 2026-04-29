package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB102 {

    @EJB
    private HelperBeanA102 helperBeanA102;

    public String identify() {
        return "HelperBeanB102";
    }
}
