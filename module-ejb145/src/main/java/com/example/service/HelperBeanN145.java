package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN145 {

    @EJB
    private HelperBeanM145 helperBeanM145;

    public String identify() {
        return "HelperBeanN145";
    }
}
