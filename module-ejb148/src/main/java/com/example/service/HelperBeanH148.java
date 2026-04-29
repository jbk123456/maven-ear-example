package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH148 {

    @EJB
    private HelperBeanG148 helperBeanG148;

    public String identify() {
        return "HelperBeanH148";
    }
}
