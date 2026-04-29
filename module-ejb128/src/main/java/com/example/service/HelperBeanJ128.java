package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ128 {

    @EJB
    private HelperBeanI128 helperBeanI128;

    public String identify() {
        return "HelperBeanJ128";
    }
}
