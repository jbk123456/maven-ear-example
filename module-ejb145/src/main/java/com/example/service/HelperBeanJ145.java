package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ145 {

    @EJB
    private HelperBeanI145 helperBeanI145;

    public String identify() {
        return "HelperBeanJ145";
    }
}
