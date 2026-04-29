package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN51 {

    @EJB
    private HelperBeanM51 helperBeanM51;

    public String identify() {
        return "HelperBeanN51";
    }
}
