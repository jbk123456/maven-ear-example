package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB118 {

    @EJB
    private HelperBeanA118 helperBeanA118;

    public String identify() {
        return "HelperBeanB118";
    }
}
