package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN141 {

    @EJB
    private HelperBeanM141 helperBeanM141;

    public String identify() {
        return "HelperBeanN141";
    }
}
