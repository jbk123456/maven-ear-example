package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI151 {

    @EJB
    private HelperBeanH151 helperBeanH151;

    public String identify() {
        return "HelperBeanI151";
    }
}
