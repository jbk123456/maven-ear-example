package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM44 {

    @EJB
    private HelperBeanL44 helperBeanL44;

    public String identify() {
        return "HelperBeanM44";
    }
}
