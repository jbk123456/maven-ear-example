package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH146 {

    @EJB
    private HelperBeanG146 helperBeanG146;

    public String identify() {
        return "HelperBeanH146";
    }
}
