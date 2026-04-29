package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK146 {

    @EJB
    private HelperBeanJ146 helperBeanJ146;

    public String identify() {
        return "HelperBeanK146";
    }
}
