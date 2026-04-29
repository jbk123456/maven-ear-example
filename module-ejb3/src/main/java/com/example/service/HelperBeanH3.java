package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH3 {

    @EJB
    private HelperBeanG3 helperBeanG3;

    public String identify() {
        return "HelperBeanH3";
    }
}
