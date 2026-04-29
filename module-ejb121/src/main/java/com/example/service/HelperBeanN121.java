package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN121 {

    @EJB
    private HelperBeanM121 helperBeanM121;

    public String identify() {
        return "HelperBeanN121";
    }
}
