package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK125 {

    @EJB
    private HelperBeanJ125 helperBeanJ125;

    public String identify() {
        return "HelperBeanK125";
    }
}
