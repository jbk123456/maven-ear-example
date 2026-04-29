package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO23 {

    @EJB
    private HelperBeanN23 helperBeanN23;

    public String identify() {
        return "HelperBeanO23";
    }
}
