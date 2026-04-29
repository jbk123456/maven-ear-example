package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN157 {

    @EJB
    private HelperBeanM157 helperBeanM157;

    public String identify() {
        return "HelperBeanN157";
    }
}
