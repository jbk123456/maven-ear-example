package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN44 {

    @EJB
    private HelperBeanM44 helperBeanM44;

    public String identify() {
        return "HelperBeanN44";
    }
}
