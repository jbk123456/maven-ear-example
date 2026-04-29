package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN159 {

    @EJB
    private HelperBeanM159 helperBeanM159;

    public String identify() {
        return "HelperBeanN159";
    }
}
