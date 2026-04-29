package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ151 {

    @EJB
    private HelperBeanI151 helperBeanI151;

    public String identify() {
        return "HelperBeanJ151";
    }
}
