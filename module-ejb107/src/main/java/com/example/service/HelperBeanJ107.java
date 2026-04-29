package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ107 {

    @EJB
    private HelperBeanI107 helperBeanI107;

    public String identify() {
        return "HelperBeanJ107";
    }
}
