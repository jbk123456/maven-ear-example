package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI70 {

    @EJB
    private HelperBeanH70 helperBeanH70;

    public String identify() {
        return "HelperBeanI70";
    }
}
