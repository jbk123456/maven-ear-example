package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB71 {

    @EJB
    private HelperBeanA71 helperBeanA71;

    public String identify() {
        return "HelperBeanB71";
    }
}
