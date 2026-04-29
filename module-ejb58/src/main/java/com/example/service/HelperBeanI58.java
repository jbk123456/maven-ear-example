package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI58 {

    @EJB
    private HelperBeanH58 helperBeanH58;

    public String identify() {
        return "HelperBeanI58";
    }
}
