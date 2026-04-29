package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK138 {

    @EJB
    private HelperBeanJ138 helperBeanJ138;

    public String identify() {
        return "HelperBeanK138";
    }
}
