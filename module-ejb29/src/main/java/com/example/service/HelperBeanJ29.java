package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ29 {

    @EJB
    private HelperBeanI29 helperBeanI29;

    public String identify() {
        return "HelperBeanJ29";
    }
}
