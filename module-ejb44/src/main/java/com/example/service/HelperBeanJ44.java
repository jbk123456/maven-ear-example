package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ44 {

    @EJB
    private HelperBeanI44 helperBeanI44;

    public String identify() {
        return "HelperBeanJ44";
    }
}
