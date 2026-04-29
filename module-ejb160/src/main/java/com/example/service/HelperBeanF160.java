package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF160 {

    @EJB
    private HelperBeanE160 helperBeanE160;

    public String identify() {
        return "HelperBeanF160";
    }
}
