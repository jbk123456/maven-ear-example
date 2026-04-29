package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI90 {

    @EJB
    private HelperBeanH90 helperBeanH90;

    public String identify() {
        return "HelperBeanI90";
    }
}
