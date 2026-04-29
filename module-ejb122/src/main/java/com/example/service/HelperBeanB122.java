package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB122 {

    @EJB
    private HelperBeanA122 helperBeanA122;

    public String identify() {
        return "HelperBeanB122";
    }
}
