package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN171 {

    @EJB
    private HelperBeanM171 helperBeanM171;

    public String identify() {
        return "HelperBeanN171";
    }
}
