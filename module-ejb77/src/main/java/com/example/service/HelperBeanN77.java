package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN77 {

    @EJB
    private HelperBeanM77 helperBeanM77;

    public String identify() {
        return "HelperBeanN77";
    }
}
