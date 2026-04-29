package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG8 {

    @EJB
    private HelperBeanF8 helperBeanF8;

    public String identify() {
        return "HelperBeanG8";
    }
}
