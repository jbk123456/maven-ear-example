package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ23 {

    @EJB
    private HelperBeanI23 helperBeanI23;

    public String identify() {
        return "HelperBeanJ23";
    }
}
