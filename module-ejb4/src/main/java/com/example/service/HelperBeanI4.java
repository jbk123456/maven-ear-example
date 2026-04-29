package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI4 {

    @EJB
    private HelperBeanH4 helperBeanH4;

    public String identify() {
        return "HelperBeanI4";
    }
}
