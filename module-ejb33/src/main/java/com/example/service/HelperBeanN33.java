package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN33 {

    @EJB
    private HelperBeanM33 helperBeanM33;

    public String identify() {
        return "HelperBeanN33";
    }
}
