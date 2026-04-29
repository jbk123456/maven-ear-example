package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG176 {

    @EJB
    private HelperBeanF176 helperBeanF176;

    public String identify() {
        return "HelperBeanG176";
    }
}
