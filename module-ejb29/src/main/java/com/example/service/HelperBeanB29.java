package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB29 {

    @EJB
    private HelperBeanA29 helperBeanA29;

    public String identify() {
        return "HelperBeanB29";
    }
}
