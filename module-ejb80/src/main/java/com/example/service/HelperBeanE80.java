package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE80 {

    @EJB
    private HelperBeanD80 helperBeanD80;

    public String identify() {
        return "HelperBeanE80";
    }
}
