package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ132 {

    @EJB
    private HelperBeanI132 helperBeanI132;

    public String identify() {
        return "HelperBeanJ132";
    }
}
