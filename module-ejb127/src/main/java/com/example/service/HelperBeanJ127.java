package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ127 {

    @EJB
    private HelperBeanI127 helperBeanI127;

    public String identify() {
        return "HelperBeanJ127";
    }
}
