package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF171 {

    @EJB
    private HelperBeanE171 helperBeanE171;

    public String identify() {
        return "HelperBeanF171";
    }
}
