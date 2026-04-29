package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ55 {

    @EJB
    private HelperBeanI55 helperBeanI55;

    public String identify() {
        return "HelperBeanJ55";
    }
}
