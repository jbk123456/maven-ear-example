package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB60 {

    @EJB
    private HelperBeanA60 helperBeanA60;

    public String identify() {
        return "HelperBeanB60";
    }
}
