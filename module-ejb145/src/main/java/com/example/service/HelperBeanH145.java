package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH145 {

    @EJB
    private HelperBeanG145 helperBeanG145;

    public String identify() {
        return "HelperBeanH145";
    }
}
