package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ146 {

    @EJB
    private HelperBeanI146 helperBeanI146;

    public String identify() {
        return "HelperBeanJ146";
    }
}
