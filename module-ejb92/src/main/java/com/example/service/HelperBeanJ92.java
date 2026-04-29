package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ92 {

    @EJB
    private HelperBeanI92 helperBeanI92;

    public String identify() {
        return "HelperBeanJ92";
    }
}
