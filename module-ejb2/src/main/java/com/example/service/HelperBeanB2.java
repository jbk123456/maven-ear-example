package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB2 {

    @EJB
    private HelperBeanA2 helperBeanA2;

    public String identify() {
        return "HelperBeanB2";
    }
}
