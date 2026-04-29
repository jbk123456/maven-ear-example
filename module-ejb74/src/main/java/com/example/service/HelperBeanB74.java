package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB74 {

    @EJB
    private HelperBeanA74 helperBeanA74;

    public String identify() {
        return "HelperBeanB74";
    }
}
