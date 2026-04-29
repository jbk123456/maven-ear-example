package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE142 {

    @EJB
    private HelperBeanD142 helperBeanD142;

    public String identify() {
        return "HelperBeanE142";
    }
}
