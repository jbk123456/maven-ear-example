package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO109 {

    @EJB
    private HelperBeanN109 helperBeanN109;

    public String identify() {
        return "HelperBeanO109";
    }
}
