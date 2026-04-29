package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN101 {

    @EJB
    private HelperBeanM101 helperBeanM101;

    public String identify() {
        return "HelperBeanN101";
    }
}
