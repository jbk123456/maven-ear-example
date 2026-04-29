package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE86 {

    @EJB
    private HelperBeanD86 helperBeanD86;

    public String identify() {
        return "HelperBeanE86";
    }
}
