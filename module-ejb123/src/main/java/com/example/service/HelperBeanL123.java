package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL123 {

    @EJB
    private HelperBeanK123 helperBeanK123;

    public String identify() {
        return "HelperBeanL123";
    }
}
