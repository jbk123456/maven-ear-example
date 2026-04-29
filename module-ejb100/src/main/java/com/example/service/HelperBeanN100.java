package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN100 {

    @EJB
    private HelperBeanM100 helperBeanM100;

    public String identify() {
        return "HelperBeanN100";
    }
}
