package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB101 {

    @EJB
    private HelperBeanA101 helperBeanA101;

    public String identify() {
        return "HelperBeanB101";
    }
}
