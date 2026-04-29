package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN21 {

    @EJB
    private HelperBeanM21 helperBeanM21;

    public String identify() {
        return "HelperBeanN21";
    }
}
