package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE19 {

    @EJB
    private HelperBeanD19 helperBeanD19;

    public String identify() {
        return "HelperBeanE19";
    }
}
