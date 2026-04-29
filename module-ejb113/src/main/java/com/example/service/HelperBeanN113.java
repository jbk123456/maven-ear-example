package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN113 {

    @EJB
    private HelperBeanM113 helperBeanM113;

    public String identify() {
        return "HelperBeanN113";
    }
}
