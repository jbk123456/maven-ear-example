package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN92 {

    @EJB
    private HelperBeanM92 helperBeanM92;

    public String identify() {
        return "HelperBeanN92";
    }
}
