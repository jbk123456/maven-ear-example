package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE44 {

    @EJB
    private HelperBeanD44 helperBeanD44;

    public String identify() {
        return "HelperBeanE44";
    }
}
