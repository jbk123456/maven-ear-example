package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE40 {

    @EJB
    private HelperBeanD40 helperBeanD40;

    public String identify() {
        return "HelperBeanE40";
    }
}
