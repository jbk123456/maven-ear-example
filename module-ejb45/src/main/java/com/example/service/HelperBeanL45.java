package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL45 {

    @EJB
    private HelperBeanK45 helperBeanK45;

    public String identify() {
        return "HelperBeanL45";
    }
}
