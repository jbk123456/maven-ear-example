package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN46 {

    @EJB
    private HelperBeanM46 helperBeanM46;

    public String identify() {
        return "HelperBeanN46";
    }
}
