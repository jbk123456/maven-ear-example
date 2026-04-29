package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO44 {

    @EJB
    private HelperBeanN44 helperBeanN44;

    public String identify() {
        return "HelperBeanO44";
    }
}
