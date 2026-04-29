package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG160 {

    @EJB
    private HelperBeanF160 helperBeanF160;

    public String identify() {
        return "HelperBeanG160";
    }
}
