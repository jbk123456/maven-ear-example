package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ46 {

    @EJB
    private HelperBeanI46 helperBeanI46;

    public String identify() {
        return "HelperBeanJ46";
    }
}
