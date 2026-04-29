package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI169 {

    @EJB
    private HelperBeanH169 helperBeanH169;

    public String identify() {
        return "HelperBeanI169";
    }
}
