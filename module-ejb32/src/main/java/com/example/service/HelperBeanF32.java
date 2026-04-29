package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF32 {

    @EJB
    private HelperBeanE32 helperBeanE32;

    public String identify() {
        return "HelperBeanF32";
    }
}
