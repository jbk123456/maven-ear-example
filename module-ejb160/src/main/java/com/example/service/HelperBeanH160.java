package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH160 {

    @EJB
    private HelperBeanG160 helperBeanG160;

    public String identify() {
        return "HelperBeanH160";
    }
}
