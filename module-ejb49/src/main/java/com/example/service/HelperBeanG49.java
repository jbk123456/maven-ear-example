package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG49 {

    @EJB
    private HelperBeanF49 helperBeanF49;

    public String identify() {
        return "HelperBeanG49";
    }
}
