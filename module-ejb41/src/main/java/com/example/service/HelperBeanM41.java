package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM41 {

    @EJB
    private HelperBeanL41 helperBeanL41;

    public String identify() {
        return "HelperBeanM41";
    }
}
