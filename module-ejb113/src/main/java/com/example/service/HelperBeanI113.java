package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI113 {

    @EJB
    private HelperBeanH113 helperBeanH113;

    public String identify() {
        return "HelperBeanI113";
    }
}
