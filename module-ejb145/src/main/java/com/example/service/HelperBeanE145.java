package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE145 {

    @EJB
    private HelperBeanD145 helperBeanD145;

    public String identify() {
        return "HelperBeanE145";
    }
}
