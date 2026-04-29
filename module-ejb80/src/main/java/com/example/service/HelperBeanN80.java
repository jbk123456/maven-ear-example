package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN80 {

    @EJB
    private HelperBeanM80 helperBeanM80;

    public String identify() {
        return "HelperBeanN80";
    }
}
