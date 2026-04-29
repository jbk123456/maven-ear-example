package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN84 {

    @EJB
    private HelperBeanM84 helperBeanM84;

    public String identify() {
        return "HelperBeanN84";
    }
}
