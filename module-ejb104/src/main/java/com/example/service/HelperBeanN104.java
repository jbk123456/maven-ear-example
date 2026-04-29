package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN104 {

    @EJB
    private HelperBeanM104 helperBeanM104;

    public String identify() {
        return "HelperBeanN104";
    }
}
