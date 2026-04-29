package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH170 {

    @EJB
    private HelperBeanG170 helperBeanG170;

    public String identify() {
        return "HelperBeanH170";
    }
}
