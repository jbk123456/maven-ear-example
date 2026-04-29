package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF116 {

    @EJB
    private HelperBeanE116 helperBeanE116;

    public String identify() {
        return "HelperBeanF116";
    }
}
