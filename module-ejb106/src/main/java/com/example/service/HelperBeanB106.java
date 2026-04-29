package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB106 {

    @EJB
    private HelperBeanA106 helperBeanA106;

    public String identify() {
        return "HelperBeanB106";
    }
}
