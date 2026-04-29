package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM158 {

    @EJB
    private HelperBeanL158 helperBeanL158;

    public String identify() {
        return "HelperBeanM158";
    }
}
