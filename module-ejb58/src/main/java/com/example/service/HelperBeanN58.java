package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN58 {

    @EJB
    private HelperBeanM58 helperBeanM58;

    public String identify() {
        return "HelperBeanN58";
    }
}
