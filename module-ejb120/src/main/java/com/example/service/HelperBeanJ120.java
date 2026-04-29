package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ120 {

    @EJB
    private HelperBeanI120 helperBeanI120;

    public String identify() {
        return "HelperBeanJ120";
    }
}
