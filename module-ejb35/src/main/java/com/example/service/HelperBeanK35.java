package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK35 {

    @EJB
    private HelperBeanJ35 helperBeanJ35;

    public String identify() {
        return "HelperBeanK35";
    }
}
