package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH62 {

    @EJB
    private HelperBeanG62 helperBeanG62;

    public String identify() {
        return "HelperBeanH62";
    }
}
