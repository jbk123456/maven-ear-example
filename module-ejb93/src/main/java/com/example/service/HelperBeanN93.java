package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN93 {

    @EJB
    private HelperBeanM93 helperBeanM93;

    public String identify() {
        return "HelperBeanN93";
    }
}
