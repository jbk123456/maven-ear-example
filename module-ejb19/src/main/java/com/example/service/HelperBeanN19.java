package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN19 {

    @EJB
    private HelperBeanM19 helperBeanM19;

    public String identify() {
        return "HelperBeanN19";
    }
}
