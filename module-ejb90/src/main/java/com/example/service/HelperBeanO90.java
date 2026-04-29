package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO90 {

    @EJB
    private HelperBeanN90 helperBeanN90;

    public String identify() {
        return "HelperBeanO90";
    }
}
