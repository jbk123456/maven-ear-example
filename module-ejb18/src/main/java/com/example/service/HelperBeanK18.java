package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK18 {

    @EJB
    private HelperBeanJ18 helperBeanJ18;

    public String identify() {
        return "HelperBeanK18";
    }
}
