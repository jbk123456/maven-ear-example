package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG44 {

    @EJB
    private HelperBeanF44 helperBeanF44;

    public String identify() {
        return "HelperBeanG44";
    }
}
