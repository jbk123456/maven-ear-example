package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN98 {

    @EJB
    private HelperBeanM98 helperBeanM98;

    public String identify() {
        return "HelperBeanN98";
    }
}
