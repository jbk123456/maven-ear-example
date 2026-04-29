package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI95 {

    @EJB
    private HelperBeanH95 helperBeanH95;

    public String identify() {
        return "HelperBeanI95";
    }
}
