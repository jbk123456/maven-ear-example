package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB100 {

    @EJB
    private HelperBeanA100 helperBeanA100;

    public String identify() {
        return "HelperBeanB100";
    }
}
