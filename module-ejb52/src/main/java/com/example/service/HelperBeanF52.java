package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF52 {

    @EJB
    private HelperBeanE52 helperBeanE52;

    public String identify() {
        return "HelperBeanF52";
    }
}
