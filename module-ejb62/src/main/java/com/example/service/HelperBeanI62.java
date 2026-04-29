package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI62 {

    @EJB
    private HelperBeanH62 helperBeanH62;

    public String identify() {
        return "HelperBeanI62";
    }
}
