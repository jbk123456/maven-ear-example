package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ80 {

    @EJB
    private HelperBeanI80 helperBeanI80;

    public String identify() {
        return "HelperBeanJ80";
    }
}
