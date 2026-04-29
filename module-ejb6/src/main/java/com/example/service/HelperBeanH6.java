package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH6 {

    @EJB
    private HelperBeanG6 helperBeanG6;

    public String identify() {
        return "HelperBeanH6";
    }
}
