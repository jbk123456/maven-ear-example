package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB5 {

    @EJB
    private HelperBeanA5 helperBeanA5;

    public String identify() {
        return "HelperBeanB5";
    }
}
