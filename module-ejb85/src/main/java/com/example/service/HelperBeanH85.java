package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH85 {

    @EJB
    private HelperBeanG85 helperBeanG85;

    public String identify() {
        return "HelperBeanH85";
    }
}
