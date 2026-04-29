package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM152 {

    @EJB
    private HelperBeanL152 helperBeanL152;

    public String identify() {
        return "HelperBeanM152";
    }
}
