package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI44 {

    @EJB
    private HelperBeanH44 helperBeanH44;

    public String identify() {
        return "HelperBeanI44";
    }
}
