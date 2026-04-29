package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF146 {

    @EJB
    private HelperBeanE146 helperBeanE146;

    public String identify() {
        return "HelperBeanF146";
    }
}
