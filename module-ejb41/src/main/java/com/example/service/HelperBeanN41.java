package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN41 {

    @EJB
    private HelperBeanM41 helperBeanM41;

    public String identify() {
        return "HelperBeanN41";
    }
}
