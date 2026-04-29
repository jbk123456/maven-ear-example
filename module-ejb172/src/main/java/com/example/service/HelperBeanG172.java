package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG172 {

    @EJB
    private HelperBeanF172 helperBeanF172;

    public String identify() {
        return "HelperBeanG172";
    }
}
