package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ79 {

    @EJB
    private HelperBeanI79 helperBeanI79;

    public String identify() {
        return "HelperBeanJ79";
    }
}
