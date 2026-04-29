package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG132 {

    @EJB
    private HelperBeanF132 helperBeanF132;

    public String identify() {
        return "HelperBeanG132";
    }
}
