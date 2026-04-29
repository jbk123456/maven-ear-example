package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN60 {

    @EJB
    private HelperBeanM60 helperBeanM60;

    public String identify() {
        return "HelperBeanN60";
    }
}
