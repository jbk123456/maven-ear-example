package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE144 {

    @EJB
    private HelperBeanD144 helperBeanD144;

    public String identify() {
        return "HelperBeanE144";
    }
}
