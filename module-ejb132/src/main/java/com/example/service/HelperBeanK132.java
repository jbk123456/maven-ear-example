package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK132 {

    @EJB
    private HelperBeanJ132 helperBeanJ132;

    public String identify() {
        return "HelperBeanK132";
    }
}
