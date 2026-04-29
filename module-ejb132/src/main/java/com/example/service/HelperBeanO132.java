package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO132 {

    @EJB
    private HelperBeanN132 helperBeanN132;

    public String identify() {
        return "HelperBeanO132";
    }
}
