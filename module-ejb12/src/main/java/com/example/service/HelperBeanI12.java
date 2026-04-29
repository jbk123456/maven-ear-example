package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI12 {

    @EJB
    private HelperBeanH12 helperBeanH12;

    public String identify() {
        return "HelperBeanI12";
    }
}
