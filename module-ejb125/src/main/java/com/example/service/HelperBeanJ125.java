package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ125 {

    @EJB
    private HelperBeanI125 helperBeanI125;

    public String identify() {
        return "HelperBeanJ125";
    }
}
