package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH4 {

    @EJB
    private HelperBeanG4 helperBeanG4;

    public String identify() {
        return "HelperBeanH4";
    }
}
