package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI8 {

    @EJB
    private HelperBeanH8 helperBeanH8;

    public String identify() {
        return "HelperBeanI8";
    }
}
