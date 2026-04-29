package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ94 {

    @EJB
    private HelperBeanI94 helperBeanI94;

    public String identify() {
        return "HelperBeanJ94";
    }
}
