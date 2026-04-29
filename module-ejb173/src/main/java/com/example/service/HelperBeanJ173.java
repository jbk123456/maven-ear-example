package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ173 {

    @EJB
    private HelperBeanI173 helperBeanI173;

    public String identify() {
        return "HelperBeanJ173";
    }
}
