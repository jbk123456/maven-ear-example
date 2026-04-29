package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI128 {

    @EJB
    private HelperBeanH128 helperBeanH128;

    public String identify() {
        return "HelperBeanI128";
    }
}
