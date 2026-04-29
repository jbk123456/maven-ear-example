package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI50 {

    @EJB
    private HelperBeanH50 helperBeanH50;

    public String identify() {
        return "HelperBeanI50";
    }
}
