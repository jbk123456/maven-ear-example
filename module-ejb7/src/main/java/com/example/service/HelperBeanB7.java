package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB7 {

    @EJB
    private HelperBeanA7 helperBeanA7;

    public String identify() {
        return "HelperBeanB7";
    }
}
