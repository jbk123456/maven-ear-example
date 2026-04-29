package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF49 {

    @EJB
    private HelperBeanE49 helperBeanE49;

    public String identify() {
        return "HelperBeanF49";
    }
}
