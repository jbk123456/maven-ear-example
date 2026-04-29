package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG58 {

    @EJB
    private HelperBeanF58 helperBeanF58;

    public String identify() {
        return "HelperBeanG58";
    }
}
