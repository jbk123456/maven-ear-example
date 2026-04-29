package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK46 {

    @EJB
    private HelperBeanJ46 helperBeanJ46;

    public String identify() {
        return "HelperBeanK46";
    }
}
