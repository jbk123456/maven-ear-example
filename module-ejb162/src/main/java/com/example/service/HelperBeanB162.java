package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB162 {

    @EJB
    private HelperBeanA162 helperBeanA162;

    public String identify() {
        return "HelperBeanB162";
    }
}
