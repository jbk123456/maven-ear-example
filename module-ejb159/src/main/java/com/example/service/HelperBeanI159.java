package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI159 {

    @EJB
    private HelperBeanH159 helperBeanH159;

    public String identify() {
        return "HelperBeanI159";
    }
}
