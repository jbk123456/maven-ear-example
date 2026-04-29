package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF23 {

    @EJB
    private HelperBeanE23 helperBeanE23;

    public String identify() {
        return "HelperBeanF23";
    }
}
