package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO110 {

    @EJB
    private HelperBeanN110 helperBeanN110;

    public String identify() {
        return "HelperBeanO110";
    }
}
