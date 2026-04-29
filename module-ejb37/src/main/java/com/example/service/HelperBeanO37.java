package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO37 {

    @EJB
    private HelperBeanN37 helperBeanN37;

    public String identify() {
        return "HelperBeanO37";
    }
}
