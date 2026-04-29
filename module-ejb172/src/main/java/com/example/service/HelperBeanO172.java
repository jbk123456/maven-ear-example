package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO172 {

    @EJB
    private HelperBeanN172 helperBeanN172;

    public String identify() {
        return "HelperBeanO172";
    }
}
