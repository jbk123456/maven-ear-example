package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB119 {

    @EJB
    private HelperBeanA119 helperBeanA119;

    public String identify() {
        return "HelperBeanB119";
    }
}
