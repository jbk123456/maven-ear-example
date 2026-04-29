package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO79 {

    @EJB
    private HelperBeanN79 helperBeanN79;

    public String identify() {
        return "HelperBeanO79";
    }
}
