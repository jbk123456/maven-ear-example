package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI175 {

    @EJB
    private HelperBeanH175 helperBeanH175;

    public String identify() {
        return "HelperBeanI175";
    }
}
