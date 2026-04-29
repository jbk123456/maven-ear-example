package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ12 {

    @EJB
    private HelperBeanI12 helperBeanI12;

    public String identify() {
        return "HelperBeanJ12";
    }
}
