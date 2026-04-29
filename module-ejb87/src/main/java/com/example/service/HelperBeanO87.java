package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO87 {

    @EJB
    private HelperBeanN87 helperBeanN87;

    public String identify() {
        return "HelperBeanO87";
    }
}
