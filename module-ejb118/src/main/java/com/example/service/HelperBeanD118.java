package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD118 {

    @EJB
    private HelperBeanC118 helperBeanC118;

    public String identify() {
        return "HelperBeanD118";
    }
}
