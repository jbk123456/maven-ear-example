package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE59 {

    @EJB
    private HelperBeanD59 helperBeanD59;

    public String identify() {
        return "HelperBeanE59";
    }
}
