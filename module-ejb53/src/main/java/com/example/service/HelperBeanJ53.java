package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ53 {

    @EJB
    private HelperBeanI53 helperBeanI53;

    public String identify() {
        return "HelperBeanJ53";
    }
}
