package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK4 {

    @EJB
    private HelperBeanJ4 helperBeanJ4;

    public String identify() {
        return "HelperBeanK4";
    }
}
