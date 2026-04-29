package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH177 {

    @EJB
    private HelperBeanG177 helperBeanG177;

    public String identify() {
        return "HelperBeanH177";
    }
}
