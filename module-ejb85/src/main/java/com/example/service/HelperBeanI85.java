package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI85 {

    @EJB
    private HelperBeanH85 helperBeanH85;

    public String identify() {
        return "HelperBeanI85";
    }
}
