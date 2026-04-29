package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO7 {

    @EJB
    private HelperBeanN7 helperBeanN7;

    public String identify() {
        return "HelperBeanO7";
    }
}
