package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN72 {

    @EJB
    private HelperBeanM72 helperBeanM72;

    public String identify() {
        return "HelperBeanN72";
    }
}
