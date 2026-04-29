package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF132 {

    @EJB
    private HelperBeanE132 helperBeanE132;

    public String identify() {
        return "HelperBeanF132";
    }
}
