package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK128 {

    @EJB
    private HelperBeanJ128 helperBeanJ128;

    public String identify() {
        return "HelperBeanK128";
    }
}
