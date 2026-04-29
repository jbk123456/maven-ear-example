package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH86 {

    @EJB
    private HelperBeanG86 helperBeanG86;

    public String identify() {
        return "HelperBeanH86";
    }
}
