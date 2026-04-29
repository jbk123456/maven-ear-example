package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK11 {

    @EJB
    private HelperBeanJ11 helperBeanJ11;

    public String identify() {
        return "HelperBeanK11";
    }
}
