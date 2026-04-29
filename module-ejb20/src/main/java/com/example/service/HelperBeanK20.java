package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK20 {

    @EJB
    private HelperBeanJ20 helperBeanJ20;

    public String identify() {
        return "HelperBeanK20";
    }
}
