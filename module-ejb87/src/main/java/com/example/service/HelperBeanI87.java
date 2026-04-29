package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI87 {

    @EJB
    private HelperBeanH87 helperBeanH87;

    public String identify() {
        return "HelperBeanI87";
    }
}
