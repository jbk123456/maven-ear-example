package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO8 {

    @EJB
    private HelperBeanN8 helperBeanN8;

    public String identify() {
        return "HelperBeanO8";
    }
}
