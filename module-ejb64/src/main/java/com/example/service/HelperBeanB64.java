package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB64 {

    @EJB
    private HelperBeanA64 helperBeanA64;

    public String identify() {
        return "HelperBeanB64";
    }
}
