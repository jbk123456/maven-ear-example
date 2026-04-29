package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG116 {

    @EJB
    private HelperBeanF116 helperBeanF116;

    public String identify() {
        return "HelperBeanG116";
    }
}
