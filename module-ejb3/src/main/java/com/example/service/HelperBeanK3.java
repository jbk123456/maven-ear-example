package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK3 {

    @EJB
    private HelperBeanJ3 helperBeanJ3;

    public String identify() {
        return "HelperBeanK3";
    }
}
