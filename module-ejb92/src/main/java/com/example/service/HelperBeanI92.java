package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI92 {

    @EJB
    private HelperBeanH92 helperBeanH92;

    public String identify() {
        return "HelperBeanI92";
    }
}
