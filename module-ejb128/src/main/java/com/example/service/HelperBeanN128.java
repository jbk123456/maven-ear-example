package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN128 {

    @EJB
    private HelperBeanM128 helperBeanM128;

    public String identify() {
        return "HelperBeanN128";
    }
}
