package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL90 {

    @EJB
    private HelperBeanK90 helperBeanK90;

    public String identify() {
        return "HelperBeanL90";
    }
}
