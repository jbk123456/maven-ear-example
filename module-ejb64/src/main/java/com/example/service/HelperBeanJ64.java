package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ64 {

    @EJB
    private HelperBeanI64 helperBeanI64;

    public String identify() {
        return "HelperBeanJ64";
    }
}
