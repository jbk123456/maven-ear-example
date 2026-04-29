package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ42 {

    @EJB
    private HelperBeanI42 helperBeanI42;

    public String identify() {
        return "HelperBeanJ42";
    }
}
