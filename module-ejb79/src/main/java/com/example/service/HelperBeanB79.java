package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB79 {

    @EJB
    private HelperBeanA79 helperBeanA79;

    public String identify() {
        return "HelperBeanB79";
    }
}
