package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ85 {

    @EJB
    private HelperBeanI85 helperBeanI85;

    public String identify() {
        return "HelperBeanJ85";
    }
}
