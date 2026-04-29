package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD168 {

    @EJB
    private HelperBeanC168 helperBeanC168;

    public String identify() {
        return "HelperBeanD168";
    }
}
