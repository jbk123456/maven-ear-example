package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB75 {

    @EJB
    private HelperBeanA75 helperBeanA75;

    public String identify() {
        return "HelperBeanB75";
    }
}
