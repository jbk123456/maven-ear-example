package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO58 {

    @EJB
    private HelperBeanN58 helperBeanN58;

    public String identify() {
        return "HelperBeanO58";
    }
}
