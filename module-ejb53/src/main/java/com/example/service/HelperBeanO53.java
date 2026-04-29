package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO53 {

    @EJB
    private HelperBeanN53 helperBeanN53;

    public String identify() {
        return "HelperBeanO53";
    }
}
