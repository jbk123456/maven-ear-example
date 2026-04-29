package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM75 {

    @EJB
    private HelperBeanL75 helperBeanL75;

    public String identify() {
        return "HelperBeanM75";
    }
}
