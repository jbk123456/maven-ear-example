package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK12 {

    @EJB
    private HelperBeanJ12 helperBeanJ12;

    public String identify() {
        return "HelperBeanK12";
    }
}
