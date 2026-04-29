package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI109 {

    @EJB
    private HelperBeanH109 helperBeanH109;

    public String identify() {
        return "HelperBeanI109";
    }
}
