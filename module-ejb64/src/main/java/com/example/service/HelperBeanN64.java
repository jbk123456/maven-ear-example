package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN64 {

    @EJB
    private HelperBeanM64 helperBeanM64;

    public String identify() {
        return "HelperBeanN64";
    }
}
