package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH158 {

    @EJB
    private HelperBeanG158 helperBeanG158;

    public String identify() {
        return "HelperBeanH158";
    }
}
