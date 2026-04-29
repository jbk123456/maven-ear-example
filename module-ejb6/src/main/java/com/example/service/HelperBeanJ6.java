package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ6 {

    @EJB
    private HelperBeanI6 helperBeanI6;

    public String identify() {
        return "HelperBeanJ6";
    }
}
