package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN76 {

    @EJB
    private HelperBeanM76 helperBeanM76;

    public String identify() {
        return "HelperBeanN76";
    }
}
