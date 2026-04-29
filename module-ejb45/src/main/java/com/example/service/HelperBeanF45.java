package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF45 {

    @EJB
    private HelperBeanE45 helperBeanE45;

    public String identify() {
        return "HelperBeanF45";
    }
}
