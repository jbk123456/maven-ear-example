package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN18 {

    @EJB
    private HelperBeanM18 helperBeanM18;

    public String identify() {
        return "HelperBeanN18";
    }
}
