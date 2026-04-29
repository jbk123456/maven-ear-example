package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG146 {

    @EJB
    private HelperBeanF146 helperBeanF146;

    public String identify() {
        return "HelperBeanG146";
    }
}
