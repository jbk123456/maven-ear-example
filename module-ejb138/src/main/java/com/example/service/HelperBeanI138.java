package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI138 {

    @EJB
    private HelperBeanH138 helperBeanH138;

    public String identify() {
        return "HelperBeanI138";
    }
}
