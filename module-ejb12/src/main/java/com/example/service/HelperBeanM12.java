package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM12 {

    @EJB
    private HelperBeanL12 helperBeanL12;

    public String identify() {
        return "HelperBeanM12";
    }
}
