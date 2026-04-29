package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF12 {

    @EJB
    private HelperBeanE12 helperBeanE12;

    public String identify() {
        return "HelperBeanF12";
    }
}
