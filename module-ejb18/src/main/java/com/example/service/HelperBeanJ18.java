package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ18 {

    @EJB
    private HelperBeanI18 helperBeanI18;

    public String identify() {
        return "HelperBeanJ18";
    }
}
