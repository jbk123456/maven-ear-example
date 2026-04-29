package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI64 {

    @EJB
    private HelperBeanH64 helperBeanH64;

    public String identify() {
        return "HelperBeanI64";
    }
}
