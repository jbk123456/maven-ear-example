package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB19 {

    @EJB
    private HelperBeanA19 helperBeanA19;

    public String identify() {
        return "HelperBeanB19";
    }
}
