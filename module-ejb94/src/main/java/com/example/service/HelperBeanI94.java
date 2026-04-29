package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI94 {

    @EJB
    private HelperBeanH94 helperBeanH94;

    public String identify() {
        return "HelperBeanI94";
    }
}
