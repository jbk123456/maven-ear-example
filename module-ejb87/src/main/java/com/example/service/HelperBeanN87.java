package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN87 {

    @EJB
    private HelperBeanM87 helperBeanM87;

    public String identify() {
        return "HelperBeanN87";
    }
}
