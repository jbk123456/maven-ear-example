package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE156 {

    @EJB
    private HelperBeanD156 helperBeanD156;

    public String identify() {
        return "HelperBeanE156";
    }
}
