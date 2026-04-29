package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL20 {

    @EJB
    private HelperBeanK20 helperBeanK20;

    public String identify() {
        return "HelperBeanL20";
    }
}
