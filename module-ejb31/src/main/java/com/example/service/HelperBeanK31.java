package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK31 {

    @EJB
    private HelperBeanJ31 helperBeanJ31;

    public String identify() {
        return "HelperBeanK31";
    }
}
