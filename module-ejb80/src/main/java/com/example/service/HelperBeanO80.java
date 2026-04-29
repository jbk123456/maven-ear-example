package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO80 {

    @EJB
    private HelperBeanN80 helperBeanN80;

    public String identify() {
        return "HelperBeanO80";
    }
}
