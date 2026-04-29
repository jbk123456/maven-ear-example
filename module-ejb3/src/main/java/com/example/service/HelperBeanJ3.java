package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ3 {

    @EJB
    private HelperBeanI3 helperBeanI3;

    public String identify() {
        return "HelperBeanJ3";
    }
}
