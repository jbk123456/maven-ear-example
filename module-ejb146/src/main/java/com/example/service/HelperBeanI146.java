package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI146 {

    @EJB
    private HelperBeanH146 helperBeanH146;

    public String identify() {
        return "HelperBeanI146";
    }
}
