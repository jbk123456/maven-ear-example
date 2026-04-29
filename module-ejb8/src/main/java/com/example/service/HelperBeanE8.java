package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE8 {

    @EJB
    private HelperBeanD8 helperBeanD8;

    public String identify() {
        return "HelperBeanE8";
    }
}
