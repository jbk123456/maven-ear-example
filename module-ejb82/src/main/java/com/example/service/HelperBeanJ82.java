package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ82 {

    @EJB
    private HelperBeanI82 helperBeanI82;

    public String identify() {
        return "HelperBeanJ82";
    }
}
