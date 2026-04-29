package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ57 {

    @EJB
    private HelperBeanI57 helperBeanI57;

    public String identify() {
        return "HelperBeanJ57";
    }
}
