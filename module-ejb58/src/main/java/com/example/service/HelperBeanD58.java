package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD58 {

    @EJB
    private HelperBeanC58 helperBeanC58;

    public String identify() {
        return "HelperBeanD58";
    }
}
