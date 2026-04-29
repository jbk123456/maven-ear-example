package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH32 {

    @EJB
    private HelperBeanG32 helperBeanG32;

    public String identify() {
        return "HelperBeanH32";
    }
}
