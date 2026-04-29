package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL50 {

    @EJB
    private HelperBeanK50 helperBeanK50;

    public String identify() {
        return "HelperBeanL50";
    }
}
