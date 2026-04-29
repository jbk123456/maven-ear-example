package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI161 {

    @EJB
    private HelperBeanH161 helperBeanH161;

    public String identify() {
        return "HelperBeanI161";
    }
}
