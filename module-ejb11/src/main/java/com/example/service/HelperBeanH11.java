package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH11 {

    @EJB
    private HelperBeanG11 helperBeanG11;

    public String identify() {
        return "HelperBeanH11";
    }
}
