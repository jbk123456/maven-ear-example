package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI3 {

    @EJB
    private HelperBeanH3 helperBeanH3;

    public String identify() {
        return "HelperBeanI3";
    }
}
