package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN11 {

    @EJB
    private HelperBeanM11 helperBeanM11;

    public String identify() {
        return "HelperBeanN11";
    }
}
