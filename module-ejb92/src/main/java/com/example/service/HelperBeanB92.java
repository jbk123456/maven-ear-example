package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB92 {

    @EJB
    private HelperBeanA92 helperBeanA92;

    public String identify() {
        return "HelperBeanB92";
    }
}
