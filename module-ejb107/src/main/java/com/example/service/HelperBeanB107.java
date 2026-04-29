package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB107 {

    @EJB
    private HelperBeanA107 helperBeanA107;

    public String identify() {
        return "HelperBeanB107";
    }
}
