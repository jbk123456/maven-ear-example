package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK10 {

    @EJB
    private HelperBeanJ10 helperBeanJ10;

    public String identify() {
        return "HelperBeanK10";
    }
}
