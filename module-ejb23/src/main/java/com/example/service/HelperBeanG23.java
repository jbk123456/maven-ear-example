package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG23 {

    @EJB
    private HelperBeanF23 helperBeanF23;

    public String identify() {
        return "HelperBeanG23";
    }
}
