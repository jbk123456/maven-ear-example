package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE176 {

    @EJB
    private HelperBeanD176 helperBeanD176;

    public String identify() {
        return "HelperBeanE176";
    }
}
