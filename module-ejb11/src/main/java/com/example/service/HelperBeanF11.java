package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF11 {

    @EJB
    private HelperBeanE11 helperBeanE11;

    public String identify() {
        return "HelperBeanF11";
    }
}
