package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN95 {

    @EJB
    private HelperBeanM95 helperBeanM95;

    public String identify() {
        return "HelperBeanN95";
    }
}
