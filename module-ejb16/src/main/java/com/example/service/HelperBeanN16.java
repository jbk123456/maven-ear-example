package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN16 {

    @EJB
    private HelperBeanM16 helperBeanM16;

    public String identify() {
        return "HelperBeanN16";
    }
}
