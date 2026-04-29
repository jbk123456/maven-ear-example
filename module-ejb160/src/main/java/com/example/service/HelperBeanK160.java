package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK160 {

    @EJB
    private HelperBeanJ160 helperBeanJ160;

    public String identify() {
        return "HelperBeanK160";
    }
}
