package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI86 {

    @EJB
    private HelperBeanH86 helperBeanH86;

    public String identify() {
        return "HelperBeanI86";
    }
}
