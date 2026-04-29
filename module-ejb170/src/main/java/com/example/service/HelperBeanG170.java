package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG170 {

    @EJB
    private HelperBeanF170 helperBeanF170;

    public String identify() {
        return "HelperBeanG170";
    }
}
