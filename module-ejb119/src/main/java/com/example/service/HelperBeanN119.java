package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN119 {

    @EJB
    private HelperBeanM119 helperBeanM119;

    public String identify() {
        return "HelperBeanN119";
    }
}
