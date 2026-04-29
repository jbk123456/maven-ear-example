package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL127 {

    @EJB
    private HelperBeanK127 helperBeanK127;

    public String identify() {
        return "HelperBeanL127";
    }
}
