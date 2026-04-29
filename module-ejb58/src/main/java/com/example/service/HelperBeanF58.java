package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF58 {

    @EJB
    private HelperBeanE58 helperBeanE58;

    public String identify() {
        return "HelperBeanF58";
    }
}
