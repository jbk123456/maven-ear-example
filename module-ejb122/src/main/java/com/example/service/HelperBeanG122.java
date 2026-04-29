package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG122 {

    @EJB
    private HelperBeanF122 helperBeanF122;

    public String identify() {
        return "HelperBeanG122";
    }
}
