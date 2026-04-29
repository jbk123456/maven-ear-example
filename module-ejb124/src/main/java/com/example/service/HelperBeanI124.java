package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI124 {

    @EJB
    private HelperBeanH124 helperBeanH124;

    public String identify() {
        return "HelperBeanI124";
    }
}
