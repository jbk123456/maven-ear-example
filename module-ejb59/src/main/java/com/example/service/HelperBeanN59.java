package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN59 {

    @EJB
    private HelperBeanM59 helperBeanM59;

    public String identify() {
        return "HelperBeanN59";
    }
}
