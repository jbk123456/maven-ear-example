package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI45 {

    @EJB
    private HelperBeanH45 helperBeanH45;

    public String identify() {
        return "HelperBeanI45";
    }
}
