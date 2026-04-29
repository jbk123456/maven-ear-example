package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB115 {

    @EJB
    private HelperBeanA115 helperBeanA115;

    public String identify() {
        return "HelperBeanB115";
    }
}
