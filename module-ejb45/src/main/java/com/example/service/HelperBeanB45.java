package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB45 {

    @EJB
    private HelperBeanA45 helperBeanA45;

    public String identify() {
        return "HelperBeanB45";
    }
}
