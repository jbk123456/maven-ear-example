package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD117 {

    @EJB
    private HelperBeanC117 helperBeanC117;

    public String identify() {
        return "HelperBeanD117";
    }
}
