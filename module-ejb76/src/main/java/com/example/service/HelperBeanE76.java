package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE76 {

    @EJB
    private HelperBeanD76 helperBeanD76;

    public String identify() {
        return "HelperBeanE76";
    }
}
