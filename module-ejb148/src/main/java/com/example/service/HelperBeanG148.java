package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG148 {

    @EJB
    private HelperBeanF148 helperBeanF148;

    public String identify() {
        return "HelperBeanG148";
    }
}
