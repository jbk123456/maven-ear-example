package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO120 {

    @EJB
    private HelperBeanN120 helperBeanN120;

    public String identify() {
        return "HelperBeanO120";
    }
}
