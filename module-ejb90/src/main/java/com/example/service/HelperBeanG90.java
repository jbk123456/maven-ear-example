package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG90 {

    @EJB
    private HelperBeanF90 helperBeanF90;

    public String identify() {
        return "HelperBeanG90";
    }
}
