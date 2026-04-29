package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN47 {

    @EJB
    private HelperBeanM47 helperBeanM47;

    public String identify() {
        return "HelperBeanN47";
    }
}
