package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO175 {

    @EJB
    private HelperBeanN175 helperBeanN175;

    public String identify() {
        return "HelperBeanO175";
    }
}
