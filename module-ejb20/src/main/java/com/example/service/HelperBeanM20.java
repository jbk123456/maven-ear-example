package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM20 {

    @EJB
    private HelperBeanL20 helperBeanL20;

    public String identify() {
        return "HelperBeanM20";
    }
}
