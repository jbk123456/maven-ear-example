package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB32 {

    @EJB
    private HelperBeanA32 helperBeanA32;

    public String identify() {
        return "HelperBeanB32";
    }
}
