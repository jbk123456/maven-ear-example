package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF122 {

    @EJB
    private HelperBeanE122 helperBeanE122;

    public String identify() {
        return "HelperBeanF122";
    }
}
