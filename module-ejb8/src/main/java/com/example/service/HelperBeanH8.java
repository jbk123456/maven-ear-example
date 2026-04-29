package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH8 {

    @EJB
    private HelperBeanG8 helperBeanG8;

    public String identify() {
        return "HelperBeanH8";
    }
}
