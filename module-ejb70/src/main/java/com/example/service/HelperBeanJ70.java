package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ70 {

    @EJB
    private HelperBeanI70 helperBeanI70;

    public String identify() {
        return "HelperBeanJ70";
    }
}
