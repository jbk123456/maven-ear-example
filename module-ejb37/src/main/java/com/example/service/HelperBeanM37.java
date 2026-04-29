package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM37 {

    @EJB
    private HelperBeanL37 helperBeanL37;

    public String identify() {
        return "HelperBeanM37";
    }
}
