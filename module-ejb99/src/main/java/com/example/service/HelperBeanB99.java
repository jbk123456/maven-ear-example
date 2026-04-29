package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB99 {

    @EJB
    private HelperBeanA99 helperBeanA99;

    public String identify() {
        return "HelperBeanB99";
    }
}
