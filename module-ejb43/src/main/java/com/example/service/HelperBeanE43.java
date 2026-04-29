package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE43 {

    @EJB
    private HelperBeanD43 helperBeanD43;

    public String identify() {
        return "HelperBeanE43";
    }
}
