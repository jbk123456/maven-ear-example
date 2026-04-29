package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK127 {

    @EJB
    private HelperBeanJ127 helperBeanJ127;

    public String identify() {
        return "HelperBeanK127";
    }
}
