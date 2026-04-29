package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO4 {

    @EJB
    private HelperBeanN4 helperBeanN4;

    public String identify() {
        return "HelperBeanO4";
    }
}
