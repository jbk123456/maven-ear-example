package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN55 {

    @EJB
    private HelperBeanM55 helperBeanM55;

    public String identify() {
        return "HelperBeanN55";
    }
}
