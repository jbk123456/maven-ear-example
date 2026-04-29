package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO146 {

    @EJB
    private HelperBeanN146 helperBeanN146;

    public String identify() {
        return "HelperBeanO146";
    }
}
