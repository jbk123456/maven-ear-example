package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN137 {

    @EJB
    private HelperBeanM137 helperBeanM137;

    public String identify() {
        return "HelperBeanN137";
    }
}
