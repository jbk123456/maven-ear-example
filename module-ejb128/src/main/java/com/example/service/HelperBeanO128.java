package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO128 {

    @EJB
    private HelperBeanN128 helperBeanN128;

    public String identify() {
        return "HelperBeanO128";
    }
}
