package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN125 {

    @EJB
    private HelperBeanM125 helperBeanM125;

    public String identify() {
        return "HelperBeanN125";
    }
}
