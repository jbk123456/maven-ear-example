package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG51 {

    @EJB
    private HelperBeanF51 helperBeanF51;

    public String identify() {
        return "HelperBeanG51";
    }
}
