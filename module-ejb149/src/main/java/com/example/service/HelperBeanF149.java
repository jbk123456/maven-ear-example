package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF149 {

    @EJB
    private HelperBeanE149 helperBeanE149;

    public String identify() {
        return "HelperBeanF149";
    }
}
