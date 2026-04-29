package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ87 {

    @EJB
    private HelperBeanI87 helperBeanI87;

    public String identify() {
        return "HelperBeanJ87";
    }
}
