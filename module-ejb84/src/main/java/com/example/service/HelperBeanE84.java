package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE84 {

    @EJB
    private HelperBeanD84 helperBeanD84;

    public String identify() {
        return "HelperBeanE84";
    }
}
