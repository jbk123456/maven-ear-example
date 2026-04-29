package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO71 {

    @EJB
    private HelperBeanN71 helperBeanN71;

    public String identify() {
        return "HelperBeanO71";
    }
}
