package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH138 {

    @EJB
    private HelperBeanG138 helperBeanG138;

    public String identify() {
        return "HelperBeanH138";
    }
}
