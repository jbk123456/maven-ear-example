package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB17 {

    @EJB
    private HelperBeanA17 helperBeanA17;

    public String identify() {
        return "HelperBeanB17";
    }
}
