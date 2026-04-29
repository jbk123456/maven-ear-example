package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO157 {

    @EJB
    private HelperBeanN157 helperBeanN157;

    public String identify() {
        return "HelperBeanO157";
    }
}
