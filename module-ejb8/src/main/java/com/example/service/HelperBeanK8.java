package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK8 {

    @EJB
    private HelperBeanJ8 helperBeanJ8;

    public String identify() {
        return "HelperBeanK8";
    }
}
