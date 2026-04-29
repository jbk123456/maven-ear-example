package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ138 {

    @EJB
    private HelperBeanI138 helperBeanI138;

    public String identify() {
        return "HelperBeanJ138";
    }
}
