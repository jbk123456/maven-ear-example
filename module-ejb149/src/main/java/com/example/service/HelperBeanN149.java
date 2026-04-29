package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN149 {

    @EJB
    private HelperBeanM149 helperBeanM149;

    public String identify() {
        return "HelperBeanN149";
    }
}
