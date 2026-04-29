package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ90 {

    @EJB
    private HelperBeanI90 helperBeanI90;

    public String identify() {
        return "HelperBeanJ90";
    }
}
