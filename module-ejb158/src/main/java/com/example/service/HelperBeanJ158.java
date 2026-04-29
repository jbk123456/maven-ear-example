package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ158 {

    @EJB
    private HelperBeanI158 helperBeanI158;

    public String identify() {
        return "HelperBeanJ158";
    }
}
