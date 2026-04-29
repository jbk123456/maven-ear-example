package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH44 {

    @EJB
    private HelperBeanG44 helperBeanG44;

    public String identify() {
        return "HelperBeanH44";
    }
}
