package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM10 {

    @EJB
    private HelperBeanL10 helperBeanL10;

    public String identify() {
        return "HelperBeanM10";
    }
}
