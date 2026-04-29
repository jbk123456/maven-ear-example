package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI11 {

    @EJB
    private HelperBeanH11 helperBeanH11;

    public String identify() {
        return "HelperBeanI11";
    }
}
