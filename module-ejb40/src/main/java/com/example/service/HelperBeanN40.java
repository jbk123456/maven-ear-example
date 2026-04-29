package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN40 {

    @EJB
    private HelperBeanM40 helperBeanM40;

    public String identify() {
        return "HelperBeanN40";
    }
}
