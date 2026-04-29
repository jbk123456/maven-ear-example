package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN169 {

    @EJB
    private HelperBeanM169 helperBeanM169;

    public String identify() {
        return "HelperBeanN169";
    }
}
