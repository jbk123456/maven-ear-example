package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE55 {

    @EJB
    private HelperBeanD55 helperBeanD55;

    public String identify() {
        return "HelperBeanE55";
    }
}
