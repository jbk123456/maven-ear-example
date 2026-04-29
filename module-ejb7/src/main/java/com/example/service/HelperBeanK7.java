package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK7 {

    @EJB
    private HelperBeanJ7 helperBeanJ7;

    public String identify() {
        return "HelperBeanK7";
    }
}
