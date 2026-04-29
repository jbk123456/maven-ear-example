package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG32 {

    @EJB
    private HelperBeanF32 helperBeanF32;

    public String identify() {
        return "HelperBeanG32";
    }
}
