package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB161 {

    @EJB
    private HelperBeanA161 helperBeanA161;

    public String identify() {
        return "HelperBeanB161";
    }
}
