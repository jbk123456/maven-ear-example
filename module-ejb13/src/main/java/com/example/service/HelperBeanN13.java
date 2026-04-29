package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN13 {

    @EJB
    private HelperBeanM13 helperBeanM13;

    public String identify() {
        return "HelperBeanN13";
    }
}
