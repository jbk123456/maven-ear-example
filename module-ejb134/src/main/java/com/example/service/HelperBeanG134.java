package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG134 {

    @EJB
    private HelperBeanF134 helperBeanF134;

    public String identify() {
        return "HelperBeanG134";
    }
}
