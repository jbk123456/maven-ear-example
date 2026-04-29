package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK90 {

    @EJB
    private HelperBeanJ90 helperBeanJ90;

    public String identify() {
        return "HelperBeanK90";
    }
}
