package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE85 {

    @EJB
    private HelperBeanD85 helperBeanD85;

    public String identify() {
        return "HelperBeanE85";
    }
}
