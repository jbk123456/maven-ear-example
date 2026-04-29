package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM127 {

    @EJB
    private HelperBeanL127 helperBeanL127;

    public String identify() {
        return "HelperBeanM127";
    }
}
