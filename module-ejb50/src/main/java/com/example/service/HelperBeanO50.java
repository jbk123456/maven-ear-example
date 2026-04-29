package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO50 {

    @EJB
    private HelperBeanN50 helperBeanN50;

    public String identify() {
        return "HelperBeanO50";
    }
}
