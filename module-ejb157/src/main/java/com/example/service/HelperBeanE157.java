package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE157 {

    @EJB
    private HelperBeanD157 helperBeanD157;

    public String identify() {
        return "HelperBeanE157";
    }
}
