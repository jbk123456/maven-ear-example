package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO104 {

    @EJB
    private HelperBeanN104 helperBeanN104;

    public String identify() {
        return "HelperBeanO104";
    }
}
