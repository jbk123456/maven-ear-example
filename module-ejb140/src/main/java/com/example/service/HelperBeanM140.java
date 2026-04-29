package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM140 {

    @EJB
    private HelperBeanL140 helperBeanL140;

    public String identify() {
        return "HelperBeanM140";
    }
}
