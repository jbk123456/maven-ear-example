package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK158 {

    @EJB
    private HelperBeanJ158 helperBeanJ158;

    public String identify() {
        return "HelperBeanK158";
    }
}
