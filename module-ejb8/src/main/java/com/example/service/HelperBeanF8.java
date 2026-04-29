package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF8 {

    @EJB
    private HelperBeanE8 helperBeanE8;

    public String identify() {
        return "HelperBeanF8";
    }
}
