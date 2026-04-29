package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN37 {

    @EJB
    private HelperBeanM37 helperBeanM37;

    public String identify() {
        return "HelperBeanN37";
    }
}
