package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ7 {

    @EJB
    private HelperBeanI7 helperBeanI7;

    public String identify() {
        return "HelperBeanJ7";
    }
}
