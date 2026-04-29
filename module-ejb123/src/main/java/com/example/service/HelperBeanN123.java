package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN123 {

    @EJB
    private HelperBeanM123 helperBeanM123;

    public String identify() {
        return "HelperBeanN123";
    }
}
