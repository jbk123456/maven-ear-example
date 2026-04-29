package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ101 {

    @EJB
    private HelperBeanI101 helperBeanI101;

    public String identify() {
        return "HelperBeanJ101";
    }
}
