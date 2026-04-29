package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI110 {

    @EJB
    private HelperBeanH110 helperBeanH110;

    public String identify() {
        return "HelperBeanI110";
    }
}
