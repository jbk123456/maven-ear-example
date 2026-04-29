package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM92 {

    @EJB
    private HelperBeanL92 helperBeanL92;

    public String identify() {
        return "HelperBeanM92";
    }
}
