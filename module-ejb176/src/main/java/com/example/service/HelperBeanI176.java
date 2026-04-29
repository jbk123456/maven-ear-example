package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI176 {

    @EJB
    private HelperBeanH176 helperBeanH176;

    public String identify() {
        return "HelperBeanI176";
    }
}
