package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK42 {

    @EJB
    private HelperBeanJ42 helperBeanJ42;

    public String identify() {
        return "HelperBeanK42";
    }
}
