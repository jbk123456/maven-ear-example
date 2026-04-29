package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB98 {

    @EJB
    private HelperBeanA98 helperBeanA98;

    public String identify() {
        return "HelperBeanB98";
    }
}
