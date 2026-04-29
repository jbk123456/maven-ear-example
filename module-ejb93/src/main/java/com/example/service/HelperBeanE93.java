package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE93 {

    @EJB
    private HelperBeanD93 helperBeanD93;

    public String identify() {
        return "HelperBeanE93";
    }
}
