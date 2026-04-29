package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB145 {

    @EJB
    private HelperBeanA145 helperBeanA145;

    public String identify() {
        return "HelperBeanB145";
    }
}
