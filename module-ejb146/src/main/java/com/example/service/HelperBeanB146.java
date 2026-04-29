package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB146 {

    @EJB
    private HelperBeanA146 helperBeanA146;

    public String identify() {
        return "HelperBeanB146";
    }
}
