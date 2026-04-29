package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN68 {

    @EJB
    private HelperBeanM68 helperBeanM68;

    public String identify() {
        return "HelperBeanN68";
    }
}
