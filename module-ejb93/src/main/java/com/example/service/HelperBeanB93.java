package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB93 {

    @EJB
    private HelperBeanA93 helperBeanA93;

    public String identify() {
        return "HelperBeanB93";
    }
}
