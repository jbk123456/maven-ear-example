package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB43 {

    @EJB
    private HelperBeanA43 helperBeanA43;

    public String identify() {
        return "HelperBeanB43";
    }
}
