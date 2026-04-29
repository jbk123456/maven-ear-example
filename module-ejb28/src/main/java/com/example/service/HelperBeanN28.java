package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN28 {

    @EJB
    private HelperBeanM28 helperBeanM28;

    public String identify() {
        return "HelperBeanN28";
    }
}
