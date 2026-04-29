package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ162 {

    @EJB
    private HelperBeanI162 helperBeanI162;

    public String identify() {
        return "HelperBeanJ162";
    }
}
