package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO123 {

    @EJB
    private HelperBeanN123 helperBeanN123;

    public String identify() {
        return "HelperBeanO123";
    }
}
