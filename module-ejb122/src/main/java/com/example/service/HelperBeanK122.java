package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK122 {

    @EJB
    private HelperBeanJ122 helperBeanJ122;

    public String identify() {
        return "HelperBeanK122";
    }
}
