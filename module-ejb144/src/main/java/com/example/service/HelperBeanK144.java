package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK144 {

    @EJB
    private HelperBeanJ144 helperBeanJ144;

    public String identify() {
        return "HelperBeanK144";
    }
}
