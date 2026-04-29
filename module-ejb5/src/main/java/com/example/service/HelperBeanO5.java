package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO5 {

    @EJB
    private HelperBeanN5 helperBeanN5;

    public String identify() {
        return "HelperBeanO5";
    }
}
