package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN88 {

    @EJB
    private HelperBeanM88 helperBeanM88;

    public String identify() {
        return "HelperBeanN88";
    }
}
