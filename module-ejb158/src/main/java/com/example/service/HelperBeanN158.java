package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN158 {

    @EJB
    private HelperBeanM158 helperBeanM158;

    public String identify() {
        return "HelperBeanN158";
    }
}
