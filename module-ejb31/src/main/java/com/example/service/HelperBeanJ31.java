package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ31 {

    @EJB
    private HelperBeanI31 helperBeanI31;

    public String identify() {
        return "HelperBeanJ31";
    }
}
