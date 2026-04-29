package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF73 {

    @EJB
    private HelperBeanE73 helperBeanE73;

    public String identify() {
        return "HelperBeanF73";
    }
}
