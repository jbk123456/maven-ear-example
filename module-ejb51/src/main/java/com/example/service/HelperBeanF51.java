package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF51 {

    @EJB
    private HelperBeanE51 helperBeanE51;

    public String identify() {
        return "HelperBeanF51";
    }
}
