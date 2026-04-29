package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG12 {

    @EJB
    private HelperBeanF12 helperBeanF12;

    public String identify() {
        return "HelperBeanG12";
    }
}
