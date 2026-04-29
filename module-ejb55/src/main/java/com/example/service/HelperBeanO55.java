package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO55 {

    @EJB
    private HelperBeanN55 helperBeanN55;

    public String identify() {
        return "HelperBeanO55";
    }
}
