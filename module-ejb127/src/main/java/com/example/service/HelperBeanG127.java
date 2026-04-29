package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG127 {

    @EJB
    private HelperBeanF127 helperBeanF127;

    public String identify() {
        return "HelperBeanG127";
    }
}
