package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB27 {

    @EJB
    private HelperBeanA27 helperBeanA27;

    public String identify() {
        return "HelperBeanB27";
    }
}
