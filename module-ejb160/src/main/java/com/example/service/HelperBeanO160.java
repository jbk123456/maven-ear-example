package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO160 {

    @EJB
    private HelperBeanN160 helperBeanN160;

    public String identify() {
        return "HelperBeanO160";
    }
}
