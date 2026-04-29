package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB88 {

    @EJB
    private HelperBeanA88 helperBeanA88;

    public String identify() {
        return "HelperBeanB88";
    }
}
