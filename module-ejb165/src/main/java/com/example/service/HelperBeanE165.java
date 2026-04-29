package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE165 {

    @EJB
    private HelperBeanD165 helperBeanD165;

    public String identify() {
        return "HelperBeanE165";
    }
}
