package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO10 {

    @EJB
    private HelperBeanN10 helperBeanN10;

    public String identify() {
        return "HelperBeanO10";
    }
}
