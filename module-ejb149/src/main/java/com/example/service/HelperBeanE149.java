package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE149 {

    @EJB
    private HelperBeanD149 helperBeanD149;

    public String identify() {
        return "HelperBeanE149";
    }
}
