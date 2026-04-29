package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF109 {

    @EJB
    private HelperBeanE109 helperBeanE109;

    public String identify() {
        return "HelperBeanF109";
    }
}
