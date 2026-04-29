package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG45 {

    @EJB
    private HelperBeanF45 helperBeanF45;

    public String identify() {
        return "HelperBeanG45";
    }
}
