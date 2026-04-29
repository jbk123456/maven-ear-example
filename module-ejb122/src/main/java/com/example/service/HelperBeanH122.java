package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH122 {

    @EJB
    private HelperBeanG122 helperBeanG122;

    public String identify() {
        return "HelperBeanH122";
    }
}
