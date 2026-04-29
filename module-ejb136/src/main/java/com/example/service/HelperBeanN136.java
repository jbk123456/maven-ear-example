package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN136 {

    @EJB
    private HelperBeanM136 helperBeanM136;

    public String identify() {
        return "HelperBeanN136";
    }
}
