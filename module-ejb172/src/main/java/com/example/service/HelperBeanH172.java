package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH172 {

    @EJB
    private HelperBeanG172 helperBeanG172;

    public String identify() {
        return "HelperBeanH172";
    }
}
