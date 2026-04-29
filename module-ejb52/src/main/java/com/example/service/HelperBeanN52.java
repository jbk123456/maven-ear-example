package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN52 {

    @EJB
    private HelperBeanM52 helperBeanM52;

    public String identify() {
        return "HelperBeanN52";
    }
}
