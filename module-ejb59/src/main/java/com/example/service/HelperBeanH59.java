package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH59 {

    @EJB
    private HelperBeanG59 helperBeanG59;

    public String identify() {
        return "HelperBeanH59";
    }
}
