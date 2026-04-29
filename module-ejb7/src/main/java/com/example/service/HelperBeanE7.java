package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE7 {

    @EJB
    private HelperBeanD7 helperBeanD7;

    public String identify() {
        return "HelperBeanE7";
    }
}
