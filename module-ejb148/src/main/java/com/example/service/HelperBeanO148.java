package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO148 {

    @EJB
    private HelperBeanN148 helperBeanN148;

    public String identify() {
        return "HelperBeanO148";
    }
}
