package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM134 {

    @EJB
    private HelperBeanL134 helperBeanL134;

    public String identify() {
        return "HelperBeanM134";
    }
}
