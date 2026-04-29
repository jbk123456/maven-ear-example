package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK113 {

    @EJB
    private HelperBeanJ113 helperBeanJ113;

    public String identify() {
        return "HelperBeanK113";
    }
}
