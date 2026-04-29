package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ175 {

    @EJB
    private HelperBeanI175 helperBeanI175;

    public String identify() {
        return "HelperBeanJ175";
    }
}
