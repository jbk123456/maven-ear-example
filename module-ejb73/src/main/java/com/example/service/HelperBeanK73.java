package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK73 {

    @EJB
    private HelperBeanJ73 helperBeanJ73;

    public String identify() {
        return "HelperBeanK73";
    }
}
