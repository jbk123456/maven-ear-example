package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH45 {

    @EJB
    private HelperBeanG45 helperBeanG45;

    public String identify() {
        return "HelperBeanH45";
    }
}
