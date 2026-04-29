package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ8 {

    @EJB
    private HelperBeanI8 helperBeanI8;

    public String identify() {
        return "HelperBeanJ8";
    }
}
