package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ122 {

    @EJB
    private HelperBeanI122 helperBeanI122;

    public String identify() {
        return "HelperBeanJ122";
    }
}
