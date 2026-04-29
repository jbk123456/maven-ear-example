package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ50 {

    @EJB
    private HelperBeanI50 helperBeanI50;

    public String identify() {
        return "HelperBeanJ50";
    }
}
