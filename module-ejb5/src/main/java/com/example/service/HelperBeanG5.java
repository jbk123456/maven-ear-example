package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG5 {

    @EJB
    private HelperBeanF5 helperBeanF5;

    public String identify() {
        return "HelperBeanG5";
    }
}
