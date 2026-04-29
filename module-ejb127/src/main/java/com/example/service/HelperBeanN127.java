package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN127 {

    @EJB
    private HelperBeanM127 helperBeanM127;

    public String identify() {
        return "HelperBeanN127";
    }
}
