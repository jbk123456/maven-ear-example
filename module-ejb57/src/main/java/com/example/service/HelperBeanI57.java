package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI57 {

    @EJB
    private HelperBeanH57 helperBeanH57;

    public String identify() {
        return "HelperBeanI57";
    }
}
