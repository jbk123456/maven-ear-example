package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI145 {

    @EJB
    private HelperBeanH145 helperBeanH145;

    public String identify() {
        return "HelperBeanI145";
    }
}
