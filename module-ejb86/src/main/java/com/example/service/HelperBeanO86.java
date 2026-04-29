package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO86 {

    @EJB
    private HelperBeanN86 helperBeanN86;

    public String identify() {
        return "HelperBeanO86";
    }
}
