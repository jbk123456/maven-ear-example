package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN143 {

    @EJB
    private HelperBeanM143 helperBeanM143;

    public String identify() {
        return "HelperBeanN143";
    }
}
