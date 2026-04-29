package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB22 {

    @EJB
    private HelperBeanA22 helperBeanA22;

    public String identify() {
        return "HelperBeanB22";
    }
}
