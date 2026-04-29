package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ113 {

    @EJB
    private HelperBeanI113 helperBeanI113;

    public String identify() {
        return "HelperBeanJ113";
    }
}
