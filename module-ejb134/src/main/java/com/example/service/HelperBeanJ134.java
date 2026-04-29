package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ134 {

    @EJB
    private HelperBeanI134 helperBeanI134;

    public String identify() {
        return "HelperBeanJ134";
    }
}
