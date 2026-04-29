package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK49 {

    @EJB
    private HelperBeanJ49 helperBeanJ49;

    public String identify() {
        return "HelperBeanK49";
    }
}
