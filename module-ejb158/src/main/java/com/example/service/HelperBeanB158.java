package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB158 {

    @EJB
    private HelperBeanA158 helperBeanA158;

    public String identify() {
        return "HelperBeanB158";
    }
}
