package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN65 {

    @EJB
    private HelperBeanM65 helperBeanM65;

    public String identify() {
        return "HelperBeanN65";
    }
}
