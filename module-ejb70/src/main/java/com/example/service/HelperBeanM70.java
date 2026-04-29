package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM70 {

    @EJB
    private HelperBeanL70 helperBeanL70;

    public String identify() {
        return "HelperBeanM70";
    }
}
