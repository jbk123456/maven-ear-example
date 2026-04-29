package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK64 {

    @EJB
    private HelperBeanJ64 helperBeanJ64;

    public String identify() {
        return "HelperBeanK64";
    }
}
