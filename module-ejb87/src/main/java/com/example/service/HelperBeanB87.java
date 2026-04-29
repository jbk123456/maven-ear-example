package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB87 {

    @EJB
    private HelperBeanA87 helperBeanA87;

    public String identify() {
        return "HelperBeanB87";
    }
}
