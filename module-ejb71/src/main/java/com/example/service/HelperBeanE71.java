package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE71 {

    @EJB
    private HelperBeanD71 helperBeanD71;

    public String identify() {
        return "HelperBeanE71";
    }
}
