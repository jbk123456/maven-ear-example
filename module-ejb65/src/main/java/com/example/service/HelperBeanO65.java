package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO65 {

    @EJB
    private HelperBeanN65 helperBeanN65;

    public String identify() {
        return "HelperBeanO65";
    }
}
