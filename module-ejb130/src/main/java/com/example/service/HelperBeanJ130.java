package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ130 {

    @EJB
    private HelperBeanI130 helperBeanI130;

    public String identify() {
        return "HelperBeanJ130";
    }
}
