package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM169 {

    @EJB
    private HelperBeanL169 helperBeanL169;

    public String identify() {
        return "HelperBeanM169";
    }
}
