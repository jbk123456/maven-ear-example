package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH58 {

    @EJB
    private HelperBeanG58 helperBeanG58;

    public String identify() {
        return "HelperBeanH58";
    }
}
