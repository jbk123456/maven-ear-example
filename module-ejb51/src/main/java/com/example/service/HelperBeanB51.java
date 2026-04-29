package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB51 {

    @EJB
    private HelperBeanA51 helperBeanA51;

    public String identify() {
        return "HelperBeanB51";
    }
}
