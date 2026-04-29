package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ58 {

    @EJB
    private HelperBeanI58 helperBeanI58;

    public String identify() {
        return "HelperBeanJ58";
    }
}
