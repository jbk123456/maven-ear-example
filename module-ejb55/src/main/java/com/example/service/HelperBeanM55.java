package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM55 {

    @EJB
    private HelperBeanL55 helperBeanL55;

    public String identify() {
        return "HelperBeanM55";
    }
}
