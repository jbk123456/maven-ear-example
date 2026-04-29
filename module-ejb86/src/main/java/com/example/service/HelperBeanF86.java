package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF86 {

    @EJB
    private HelperBeanE86 helperBeanE86;

    public String identify() {
        return "HelperBeanF86";
    }
}
