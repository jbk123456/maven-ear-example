package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN170 {

    @EJB
    private HelperBeanM170 helperBeanM170;

    public String identify() {
        return "HelperBeanN170";
    }
}
