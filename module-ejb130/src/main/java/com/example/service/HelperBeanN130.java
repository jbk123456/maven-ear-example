package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN130 {

    @EJB
    private HelperBeanM130 helperBeanM130;

    public String identify() {
        return "HelperBeanN130";
    }
}
