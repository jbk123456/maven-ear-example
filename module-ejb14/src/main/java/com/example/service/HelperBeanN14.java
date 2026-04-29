package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN14 {

    @EJB
    private HelperBeanM14 helperBeanM14;

    public String identify() {
        return "HelperBeanN14";
    }
}
