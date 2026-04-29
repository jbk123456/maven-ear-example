package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM109 {

    @EJB
    private HelperBeanL109 helperBeanL109;

    public String identify() {
        return "HelperBeanM109";
    }
}
