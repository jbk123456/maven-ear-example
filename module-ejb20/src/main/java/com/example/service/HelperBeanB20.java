package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB20 {

    @EJB
    private HelperBeanA20 helperBeanA20;

    public String identify() {
        return "HelperBeanB20";
    }
}
