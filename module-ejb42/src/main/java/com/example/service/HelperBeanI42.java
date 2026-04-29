package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI42 {

    @EJB
    private HelperBeanH42 helperBeanH42;

    public String identify() {
        return "HelperBeanI42";
    }
}
