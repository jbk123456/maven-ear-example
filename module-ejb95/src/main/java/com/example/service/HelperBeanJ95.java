package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ95 {

    @EJB
    private HelperBeanI95 helperBeanI95;

    public String identify() {
        return "HelperBeanJ95";
    }
}
