package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB39 {

    @EJB
    private HelperBeanA39 helperBeanA39;

    public String identify() {
        return "HelperBeanB39";
    }
}
