package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE73 {

    @EJB
    private HelperBeanD73 helperBeanD73;

    public String identify() {
        return "HelperBeanE73";
    }
}
