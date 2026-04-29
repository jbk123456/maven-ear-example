package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI107 {

    @EJB
    private HelperBeanH107 helperBeanH107;

    public String identify() {
        return "HelperBeanI107";
    }
}
