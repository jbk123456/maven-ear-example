package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN148 {

    @EJB
    private HelperBeanM148 helperBeanM148;

    public String identify() {
        return "HelperBeanN148";
    }
}
