package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO170 {

    @EJB
    private HelperBeanN170 helperBeanN170;

    public String identify() {
        return "HelperBeanO170";
    }
}
