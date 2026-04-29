package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE127 {

    @EJB
    private HelperBeanD127 helperBeanD127;

    public String identify() {
        return "HelperBeanE127";
    }
}
