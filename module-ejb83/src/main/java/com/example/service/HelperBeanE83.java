package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE83 {

    @EJB
    private HelperBeanD83 helperBeanD83;

    public String identify() {
        return "HelperBeanE83";
    }
}
