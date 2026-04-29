package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF152 {

    @EJB
    private HelperBeanE152 helperBeanE152;

    public String identify() {
        return "HelperBeanF152";
    }
}
