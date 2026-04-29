package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI37 {

    @EJB
    private HelperBeanH37 helperBeanH37;

    public String identify() {
        return "HelperBeanI37";
    }
}
