package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL152 {

    @EJB
    private HelperBeanK152 helperBeanK152;

    public String identify() {
        return "HelperBeanL152";
    }
}
