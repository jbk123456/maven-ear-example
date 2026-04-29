package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH90 {

    @EJB
    private HelperBeanG90 helperBeanG90;

    public String identify() {
        return "HelperBeanH90";
    }
}
