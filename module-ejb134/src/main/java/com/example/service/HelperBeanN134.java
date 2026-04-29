package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN134 {

    @EJB
    private HelperBeanM134 helperBeanM134;

    public String identify() {
        return "HelperBeanN134";
    }
}
