package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI23 {

    @EJB
    private HelperBeanH23 helperBeanH23;

    public String identify() {
        return "HelperBeanI23";
    }
}
