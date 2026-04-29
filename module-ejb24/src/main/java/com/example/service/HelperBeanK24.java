package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK24 {

    @EJB
    private HelperBeanJ24 helperBeanJ24;

    public String identify() {
        return "HelperBeanK24";
    }
}
