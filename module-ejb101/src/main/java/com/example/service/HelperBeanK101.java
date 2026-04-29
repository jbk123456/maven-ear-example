package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK101 {

    @EJB
    private HelperBeanJ101 helperBeanJ101;

    public String identify() {
        return "HelperBeanK101";
    }
}
