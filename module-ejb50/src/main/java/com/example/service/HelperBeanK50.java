package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK50 {

    @EJB
    private HelperBeanJ50 helperBeanJ50;

    public String identify() {
        return "HelperBeanK50";
    }
}
