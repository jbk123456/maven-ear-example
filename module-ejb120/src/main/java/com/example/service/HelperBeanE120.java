package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE120 {

    @EJB
    private HelperBeanD120 helperBeanD120;

    public String identify() {
        return "HelperBeanE120";
    }
}
